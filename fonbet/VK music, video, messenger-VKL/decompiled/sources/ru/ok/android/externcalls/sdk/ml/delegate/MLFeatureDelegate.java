package ru.ok.android.externcalls.sdk.ml.delegate;

import android.content.Context;
import io.reactivex.rxjava3.core.b0;
import io.reactivex.rxjava3.core.k;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.functions.d;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.operators.flowable.q0;
import io.reactivex.rxjava3.internal.operators.flowable.u0;
import io.reactivex.rxjava3.internal.operators.maybe.l0;
import io.reactivex.rxjava3.internal.operators.maybe.n;
import io.reactivex.rxjava3.internal.operators.single.o;
import io.reactivex.rxjava3.internal.operators.single.y;
import io.reactivex.rxjava3.schedulers.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.FileAlreadyExistsException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfig;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProvider;
import ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate;
import ru.ok.android.externcalls.sdk.ml.model.AvailableMLFeatureInfo;
import ru.ok.android.externcalls.sdk.ml.model.ExtensionRule;
import ru.ok.android.externcalls.sdk.ml.model.MLFeatureType;
import ru.ok.android.externcalls.sdk.ml.model.MLModelCheckResult;
import ru.ok.android.externcalls.sdk.ml.model.ModelSpec;
import ru.ok.android.externcalls.sdk.ml.stage.DownloadStage;
import ru.ok.android.externcalls.sdk.ml.stage.RenameStage;
import ru.ok.android.externcalls.sdk.ml.stage.SaveNewModelInfoStage;
import ru.ok.android.externcalls.sdk.ml.stage.UnzipStage;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import ru.ok.android.externcalls.sdk.net.FileValidationConfig;
import ru.ok.android.externcalls.sdk.net.internal.DownloadResult;
import ru.ok.android.externcalls.sdk.stat.mldownload.MLDownloadStat;
import ru.ok.android.util.FileUtilKt;
import ru.ok.android.util.Files;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.hash.HashAlgorithm;
import ru.ok.android.webrtc.sharedprefs.MLFeaturesInfoDataSource;
import xsna.brm0;
import xsna.c5g;
import xsna.epx;
import xsna.fo8;
import xsna.izs;
import xsna.j5g;
import xsna.nbr;
import xsna.s3q0;
import xsna.z9r;
import xsna.zcl;
import xsna.zr;

/* compiled from: MLFeatureDelegate.kt */
/* loaded from: classes9.dex */
public abstract class MLFeatureDelegate {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "MLFeatureDelegate";
    private static final String ML_FEATURES_DIR_NAME = "ml_features";
    private static final String ZIP_EXTENSION = "zip";
    private final String actualModelVersion;
    private final Context context;
    private final DownloadService downloadService;
    private final RTCLog logger;
    private final MLDownloadStat mlDownloadStat;
    private final MLFeatureConfigProvider mlFeatureConfigProvider;
    private final MLFeaturesInfoDataSource mlFeaturesInfoDataSource;
    private final ModelSpec modelSpec;
    private final MLFeatureType type;

    /* compiled from: MLFeatureDelegate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: MLFeatureDelegate.kt */
    public interface MLModelValidationResult {

        /* compiled from: MLFeatureDelegate.kt */
        public static final class NeedUpdate implements MLModelValidationResult {
            private final String reason;

            public NeedUpdate(String str) {
                this.reason = str;
            }

            public final String getReason() {
                return this.reason;
            }
        }

        /* compiled from: MLFeatureDelegate.kt */
        public static final class UpToDate implements MLModelValidationResult {
            private final File model;

            public UpToDate(File file) {
                this.model = file;
            }

            public final File getModel() {
                return this.model;
            }
        }
    }

    public MLFeatureDelegate(MLFeaturesInfoDataSource mLFeaturesInfoDataSource, MLFeatureConfigProvider mLFeatureConfigProvider, DownloadService downloadService, MLDownloadStat mLDownloadStat, MLFeatureType mLFeatureType, String str, RTCLog rTCLog, Context context, ModelSpec modelSpec) {
        this.mlFeaturesInfoDataSource = mLFeaturesInfoDataSource;
        this.mlFeatureConfigProvider = mLFeatureConfigProvider;
        this.downloadService = downloadService;
        this.mlDownloadStat = mLDownloadStat;
        this.type = mLFeatureType;
        this.actualModelVersion = str;
        this.logger = rTCLog;
        this.context = context;
        this.modelSpec = modelSpec;
    }

    private final void clearDir() {
        File[] listFiles = new File(downloadDir()).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                FileUtilKt.deleteSafely(file, new MLFeatureDelegate$clearDir$1$1(this));
            }
        }
    }

    private final String downloadDir() {
        return this.context.getFilesDir() + "/ml_features/" + this.type.getSubDirName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x<DownloadStage> downloadModel(MLFeatureConfig mLFeatureConfig) {
        log("Start download " + this.type + " model file. url = " + mLFeatureConfig.getUrl());
        final File file = new File(downloadDir(), fileName());
        return new u0(new q0(this.downloadService.download(mLFeatureConfig.getUrl(), file, new FileValidationConfig(mLFeatureConfig.getChecksum(), HashAlgorithm.MD5)).u(), new d() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$downloadModel$1

            /* compiled from: MLFeatureDelegate.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$downloadModel$1$1, reason: invalid class name */
            public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements izs<String, s3q0> {
                public AnonymousClass1(Object obj) {
                    super(1, obj, MLFeatureDelegate.class, "log", "log(Ljava/lang/String;)V", 0);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(String str) {
                    invoke2(str);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str) {
                    ((MLFeatureDelegate) this.receiver).log(str);
                }
            }

            @Override // io.reactivex.rxjava3.functions.d
            public final boolean test(Integer num, Throwable th) {
                boolean z = th instanceof FileAlreadyExistsException;
                if (z) {
                    FileUtilKt.deleteSafely(file, new AnonymousClass1(this));
                }
                return num.intValue() <= 1 && z;
            }
        })).l(new l() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$downloadModel$2
            @Override // io.reactivex.rxjava3.functions.l
            public final DownloadStage apply(DownloadResult downloadResult) {
                return new DownloadStage(downloadResult.getFile(), downloadResult.getDownloadDurationMs());
            }
        });
    }

    private final k<MLFeatureConfig> fetchConfig() {
        return this.mlFeatureConfigProvider.getConfig();
    }

    private final String fileName() {
        return fo8.a(this.actualModelVersion, ".zip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void log(String str) {
        this.logger.log(LOG_TAG, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeCurrentModel() {
        this.mlFeaturesInfoDataSource.delete(this.type.getPrefsKey());
        clearDir();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RenameStage renameFiles(UnzipStage unzipStage) {
        File modelDir = unzipStage.getModelDir();
        if (!modelDir.exists() || !modelDir.isDirectory()) {
            throw new IllegalArgumentException(z9r.a(modelDir, "Path does not exist or is not directory: "));
        }
        File[] listFiles = modelDir.listFiles();
        if (listFiles == null) {
            throw new IOException("Failed to list files in directory: " + modelDir + " (access denied or I/O error)");
        }
        File file = null;
        boolean z = false;
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                String name = file2.getName();
                if (brm0.w(name, "config.cfg", false)) {
                    z = true;
                } else if (brm0.v(name, ".cfg", true)) {
                    file = file2;
                }
            }
        }
        if (z) {
            log("Valid config file already exists");
            return new RenameStage(unzipStage.getModelDir(), unzipStage.getDownloadDurationMs());
        }
        if (file == null) {
            throw new FileNotFoundException("Config file (.cfg) was not found");
        }
        File file3 = new File(modelDir, "config.cfg");
        if (file3.exists()) {
            FileUtilKt.deleteSafely$default(file3, null, 1, null);
        }
        file.renameTo(file3);
        log(zr.a("Config file ", file.getName(), " was successfully renamed to config.cfg"));
        return new RenameStage(unzipStage.getModelDir(), unzipStage.getDownloadDurationMs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SaveNewModelInfoStage saveNewModelInfo(RenameStage renameStage) {
        log("Saving new " + this.type + " model info");
        this.mlFeaturesInfoDataSource.put(this.type.getPrefsKey(), new AvailableMLFeatureInfo(this.type, this.actualModelVersion, renameStage.getModelDir().getPath()));
        return new SaveNewModelInfoStage(renameStage.getModelDir(), renameStage.getDownloadDurationMs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UnzipStage unzipModel(DownloadStage downloadStage) {
        File parentFile;
        try {
            log("Start unzipping " + this.type + " model. file " + downloadStage.getFile());
            String str = (String) j5g.a0(Files.unzip(new File(downloadDir()), downloadStage.getFile(), false));
            if (str == null || (parentFile = new File(downloadDir(), str).getParentFile()) == null) {
                throw new IllegalStateException("The archive was unpacked incorrectly");
            }
            return new UnzipStage(parentFile, downloadStage.getDownloadDurationMs());
        } finally {
            FileUtilKt.deleteSafely(downloadStage.getFile(), new MLFeatureDelegate$unzipModel$1(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MLModelValidationResult validateCurrentModel() {
        AvailableMLFeatureInfo availableMLFeatureInfo = (AvailableMLFeatureInfo) this.mlFeaturesInfoDataSource.get(this.type.getPrefsKey(), AvailableMLFeatureInfo.class);
        if (availableMLFeatureInfo == null) {
            return new MLModelValidationResult.NeedUpdate("There are no available models");
        }
        if (!epx.f(availableMLFeatureInfo.getVersion(), this.actualModelVersion)) {
            return new MLModelValidationResult.NeedUpdate("The current version is out of date");
        }
        File file = new File(availableMLFeatureInfo.getPath());
        return !isModelValid(file) ? new MLModelValidationResult.NeedUpdate("Can not verify model integrity") : new MLModelValidationResult.UpToDate(file);
    }

    public final x<? extends MLModelCheckResult> checkModel() {
        n nVar = new n(fetchConfig().n(a.b()).k(a.b()), new l() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1
            @Override // io.reactivex.rxjava3.functions.l
            public final b0<? extends MLModelCheckResult> apply(MLFeatureConfig mLFeatureConfig) {
                RTCLog rTCLog;
                MLFeatureDelegate.MLModelValidationResult validateCurrentModel;
                MLFeatureType mLFeatureType;
                MLFeatureType mLFeatureType2;
                x downloadModel;
                RTCLog rTCLog2;
                MLFeatureType mLFeatureType3;
                rTCLog = MLFeatureDelegate.this.logger;
                rTCLog.log("MLFeatureDelegate", "got ml config " + mLFeatureConfig);
                if (!mLFeatureConfig.getEnabled()) {
                    rTCLog2 = MLFeatureDelegate.this.logger;
                    mLFeatureType3 = MLFeatureDelegate.this.type;
                    rTCLog2.log("MLFeatureDelegate", "The activation of the " + mLFeatureType3 + " has been disabled remotely");
                    return x.k(MLModelCheckResult.Disabled.INSTANCE);
                }
                validateCurrentModel = MLFeatureDelegate.this.validateCurrentModel();
                if (!(validateCurrentModel instanceof MLFeatureDelegate.MLModelValidationResult.NeedUpdate)) {
                    if (!(validateCurrentModel instanceof MLFeatureDelegate.MLModelValidationResult.UpToDate)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MLFeatureDelegate mLFeatureDelegate = MLFeatureDelegate.this;
                    mLFeatureType = mLFeatureDelegate.type;
                    mLFeatureDelegate.log("Current " + mLFeatureType + " model is up to date");
                    return x.k(new MLModelCheckResult.Enabled.ExistentModel(((MLFeatureDelegate.MLModelValidationResult.UpToDate) validateCurrentModel).getModel()));
                }
                MLFeatureDelegate mLFeatureDelegate2 = MLFeatureDelegate.this;
                mLFeatureType2 = mLFeatureDelegate2.type;
                mLFeatureDelegate2.log("Current " + mLFeatureType2 + " model is invalid, the update is starting now. Reason: " + ((MLFeatureDelegate.MLModelValidationResult.NeedUpdate) validateCurrentModel).getReason());
                MLFeatureDelegate.this.removeCurrentModel();
                downloadModel = MLFeatureDelegate.this.downloadModel(mLFeatureConfig);
                final MLFeatureDelegate mLFeatureDelegate3 = MLFeatureDelegate.this;
                y l = downloadModel.l(new l() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1.1
                    @Override // io.reactivex.rxjava3.functions.l
                    public final UnzipStage apply(DownloadStage downloadStage) {
                        UnzipStage unzipModel;
                        unzipModel = MLFeatureDelegate.this.unzipModel(downloadStage);
                        return unzipModel;
                    }
                });
                final MLFeatureDelegate mLFeatureDelegate4 = MLFeatureDelegate.this;
                y l2 = l.l(new l() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1.2
                    @Override // io.reactivex.rxjava3.functions.l
                    public final RenameStage apply(UnzipStage unzipStage) {
                        RenameStage renameFiles;
                        renameFiles = MLFeatureDelegate.this.renameFiles(unzipStage);
                        return renameFiles;
                    }
                });
                final MLFeatureDelegate mLFeatureDelegate5 = MLFeatureDelegate.this;
                io.reactivex.rxjava3.internal.operators.single.b0 m = l2.l(new l() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1.3
                    @Override // io.reactivex.rxjava3.functions.l
                    public final SaveNewModelInfoStage apply(RenameStage renameStage) {
                        SaveNewModelInfoStage saveNewModelInfo;
                        saveNewModelInfo = MLFeatureDelegate.this.saveNewModelInfo(renameStage);
                        return saveNewModelInfo;
                    }
                }).m(io.reactivex.rxjava3.android.schedulers.a.b());
                final MLFeatureDelegate mLFeatureDelegate6 = MLFeatureDelegate.this;
                y l3 = m.l(new l() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1.4
                    @Override // io.reactivex.rxjava3.functions.l
                    public final MLModelCheckResult.Enabled.UpdatedModel apply(SaveNewModelInfoStage saveNewModelInfoStage) {
                        String str;
                        File file = saveNewModelInfoStage.getFile();
                        str = MLFeatureDelegate.this.actualModelVersion;
                        return new MLModelCheckResult.Enabled.UpdatedModel(file, str, saveNewModelInfoStage.getDownloadDurationMs());
                    }
                });
                final MLFeatureDelegate mLFeatureDelegate7 = MLFeatureDelegate.this;
                o oVar = new o(l3, new f() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1.5
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(MLModelCheckResult.Enabled.UpdatedModel updatedModel) {
                        MLFeatureType mLFeatureType4;
                        MLDownloadStat mLDownloadStat;
                        MLFeatureDelegate mLFeatureDelegate8 = MLFeatureDelegate.this;
                        mLFeatureType4 = mLFeatureDelegate8.type;
                        mLFeatureDelegate8.log(mLFeatureType4 + " ml model updated successfully");
                        mLDownloadStat = MLFeatureDelegate.this.mlDownloadStat;
                        mLDownloadStat.readyToUse(updatedModel.getVersion(), updatedModel.getDownloadDurationMs());
                    }
                });
                final MLFeatureDelegate mLFeatureDelegate8 = MLFeatureDelegate.this;
                return oVar.h(new f() { // from class: ru.ok.android.externcalls.sdk.ml.delegate.MLFeatureDelegate$checkModel$1.6
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Throwable th) {
                        MLFeatureType mLFeatureType4;
                        MLDownloadStat mLDownloadStat;
                        String str;
                        MLFeatureDelegate mLFeatureDelegate9 = MLFeatureDelegate.this;
                        mLFeatureType4 = mLFeatureDelegate9.type;
                        mLFeatureDelegate9.log("Error during " + mLFeatureType4 + " ml model update: " + th);
                        mLDownloadStat = MLFeatureDelegate.this.mlDownloadStat;
                        str = MLFeatureDelegate.this.actualModelVersion;
                        mLDownloadStat.error(str, th.getMessage());
                    }
                });
            }
        });
        MLModelCheckResult.Disabled disabled = MLModelCheckResult.Disabled.INSTANCE;
        Objects.requireNonNull(disabled, "defaultItem is null");
        return new l0(nVar, disabled);
    }

    public boolean isModelValid(File file) {
        File[] listFiles;
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : listFiles) {
            if (file2.length() >= this.modelSpec.getMinFileSize()) {
                arrayList.add(file2);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(nbr.m((File) it.next()));
        }
        Set<String> S0 = j5g.S0(arrayList2);
        Set<ExtensionRule> requiredExtensions = this.modelSpec.getRequiredExtensions();
        if ((requiredExtensions instanceof Collection) && requiredExtensions.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = requiredExtensions.iterator();
        while (it2.hasNext()) {
            if (!((ExtensionRule) it2.next()).isSatisfied(S0)) {
                return false;
            }
        }
        return true;
    }
}
