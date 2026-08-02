package xsna;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$AutoRepostToStoryWithLikes;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$DelayedPublication;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$Playlists;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$PostingRedirectBanner;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$Products;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.MoveFileException;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.VideoConfigExtractionException;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.AutoRepostToStoriesData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsPreviewData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadPrivacyData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadUnmodifiableData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.CoauthorsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ProductsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalNumber;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.DisableableFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.DisableableSwitch;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.HideableFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.HideableSwitch;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.clips.upload.ClipEditorSizeParams;
import com.vk.media.MediaUtils;
import com.vk.media.pipeline.model.item.AudioItem;
import com.vk.media.pipeline.model.item.VideoEncodedItem;
import com.vk.media.pipeline.model.quality.MediaQuality;
import com.vk.media.pipeline.model.source.local.TrackMediaSource;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ChangePreview;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import java.io.File;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.chd;
import xsna.mjf;

/* compiled from: ClipsUploadInitCompactExecutor.kt */
/* loaded from: classes17.dex */
public final class lgf extends uvj<ClipsUploadState, Object, mjf.c, mjf, ugf, qef> {
    public final nn50<ClipsUploadState, Object, mjf, ugf, qef> g;
    public final lff h;
    public final x9e i;
    public final rhd j;
    public final mud k;
    public final lwe l;
    public final mhd m;
    public final caf n;
    public final f100 o;

    public lgf(nk50 nk50Var, nn50<ClipsUploadState, Object, mjf, ugf, qef> nn50Var, lff lffVar, x9e x9eVar, rhd rhdVar, mud mudVar, lwe lweVar, mhd mhdVar, caf cafVar, f100 f100Var) {
        super(nk50Var, nn50Var);
        this.g = nn50Var;
        this.h = lffVar;
        this.i = x9eVar;
        this.j = rhdVar;
        this.k = mudVar;
        this.l = lweVar;
        this.m = mhdVar;
        this.n = cafVar;
        this.o = f100Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|(1:(1:9)(2:40|41))(4:42|(2:44|(1:46)(2:47|48))|49|(3:51|(1:53)|(1:55)(1:56))(2:57|58))|10|11|12|13|14|15|16|(8:18|19|(1:21)(1:30)|22|23|(1:25)(1:29)|26|27)(2:31|32)))|59|6|(0)(0)|10|11|12|13|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0122, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0123, code lost:
    
        r13.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0126, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0162, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0163, code lost:
    
        com.vk.log.L.i(r0);
        r21 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014c A[Catch: all -> 0x0162, TryCatch #2 {all -> 0x0162, blocks: (B:12:0x0103, B:15:0x011e, B:16:0x0127, B:31:0x014c, B:32:0x0161, B:36:0x0123, B:37:0x0126, B:14:0x0111), top: B:11:0x0103, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r10v16, types: [T, android.graphics.Bitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(lgf lgfVar, ClipsUploadUiVkNavigator.ClipUploadDataCompact clipUploadDataCompact, Set set, ContinuationImpl continuationImpl) {
        hgf hgfVar;
        int i;
        MediaUtils.f d;
        ClipsUploadUiVkNavigator.ClipUploadDataCompact clipUploadDataCompact2;
        File file;
        Set set2;
        File f;
        lff lffVar = lgfVar.h;
        lwe lweVar = lgfVar.l;
        if (continuationImpl instanceof hgf) {
            hgfVar = (hgf) continuationImpl;
            int i2 = hgfVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hgfVar.label = i2 - Integer.MIN_VALUE;
                Object obj = hgfVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hgfVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    File file2 = clipUploadDataCompact.d;
                    File b = lffVar.b(PrivateSubdir.CLIPS_VIDEO);
                    if (!brm0.B(file2.getAbsolutePath(), b.getAbsolutePath(), false)) {
                        File a = lffVar.a(b);
                        if (!lffVar.c(file2, a, new kgf())) {
                            throw new MoveFileException("Failed to move file. Its not safe to share.");
                        }
                        file2 = a;
                    }
                    d = MediaUtils.a.d(file2.getAbsolutePath());
                    if (d == null) {
                        throw new VideoConfigExtractionException();
                    }
                    hgfVar.L$0 = clipUploadDataCompact;
                    hgfVar.L$1 = set;
                    hgfVar.L$2 = file2;
                    hgfVar.L$3 = d;
                    hgfVar.label = 1;
                    Object d2 = lgfVar.k.d(file2, d, hgfVar);
                    if (d2 != coroutineSingletons) {
                        d2 = s3q0.a;
                    }
                    if (d2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    clipUploadDataCompact2 = clipUploadDataCompact;
                    file = file2;
                    set2 = set;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    MediaUtils.f fVar = (MediaUtils.f) hgfVar.L$3;
                    file = (File) hgfVar.L$2;
                    Set set3 = (Set) hgfVar.L$1;
                    clipUploadDataCompact2 = (ClipsUploadUiVkNavigator.ClipUploadDataCompact) hgfVar.L$0;
                    kotlin.a.a(obj);
                    set2 = set3;
                    d = fVar;
                }
                MediaUtils.d a2 = two0.a(Collections.singletonList(d), 0.5625f);
                lwo0 lwo0Var = new lwo0(lgfVar.o);
                Uri fromFile = Uri.fromFile(file);
                long j = d.f * 1000;
                VideoEncodedItem videoEncodedItem = new VideoEncodedItem(new TrackMediaSource(fromFile, -1), 0L, j, 1.0d, null, 16, null);
                AudioItem audioItem = new AudioItem(new TrackMediaSource(fromFile, -1), 0L, j, 1.0d, 1.0f, null, 32, null);
                meg megVar = new meg(lwo0Var);
                megVar.c(videoEncodedItem);
                megVar.a(audioItem);
                Timeline b2 = megVar.b().b();
                String absolutePath = file.getAbsolutePath();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(absolutePath);
                ref$ObjectRef.element = MediaUtils.a.i(0L, mediaMetadataRetriever, a2);
                s3q0 s3q0Var = s3q0.a;
                mediaMetadataRetriever.release();
                Bitmap bitmap = (Bitmap) ref$ObjectRef.element;
                File file3 = new File(lffVar.b(PrivateSubdir.TEMP_UPLOADS), UUID.randomUUID().toString());
                com.vk.stories.b.a.getClass();
                f = com.vk.stories.b.f(bitmap, file3);
                if (f != null) {
                    throw new IllegalStateException("bitmap was to saved to " + file3.getPath());
                }
                File file4 = f;
                lgfVar.j.h(chd.a.a(clipUploadDataCompact2.e), false);
                ClipsEncoderParameters clipsEncoderParameters = new ClipsEncoderParameters(b2, new ClipsEncoderParameters.VideoOutputSettings(a2.a, a2.b), new ClipEditorSizeParams(a2.a, a2.b), MediaQuality.HIGH, file4, null, null, 64, null);
                Serializer.c<ClipsVideoItemLocation> cVar = ClipsVideoItemLocation.CREATOR;
                ClipsUploadUnmodifiableData clipsUploadUnmodifiableData = new ClipsUploadUnmodifiableData(new SecureRandom().nextInt(Integer.MAX_VALUE), wrp.b(clipUploadDataCompact2.c), d.f, null, null, null, null, null, clipUploadDataCompact2.f, null, null, null, null, null, 1, MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType.GALLERY, null, false, false, false, false, false, e43.m(ClipsVideoItemLocation.a.a(lgfVar.i.a(file))));
                String str = clipUploadDataCompact2.b;
                EmptyList emptyList = EmptyList.b;
                ClipsUploadStaticData clipsUploadStaticData = new ClipsUploadStaticData(str, emptyList, lweVar.i(), lweVar.f(), false, new HideableSwitch(false, false), new ClipsPreviewData(MobileOfficialAppsClipsStat$ChangePreview.PreviewType.FIRST_FRAME, -1L, false), null, null, lgfVar.n.a(), new HideableFeature(new ProductsData(emptyList), set2.contains(ClipUploadScreenFeature$Products.b)), false, false, false, false);
                ConditionalFeature.State state = ConditionalFeature.State.HIDDEN;
                return new ClipsUploadDataInternal(clipsEncoderParameters, clipsUploadUnmodifiableData, clipsUploadStaticData, new ClipsUploadAuthorRelatedData(new ConditionalFeature(null, state), new ConditionalFeature(ClipsUploadPrivacyData.e.getSTUB(), state), new ConditionalFeature(new CoauthorsData(emptyList), state), new HideableFeature(null, set2.contains(ClipUploadScreenFeature$Playlists.b)), new HideableFeature(null, false), null, new DisableableFeature(null, true), new DisableableSwitch(lweVar.d(), false), new ConditionalNumber(null, !set2.contains(ClipUploadScreenFeature$DelayedPublication.b) ? ConditionalNumber.State.HIDDEN : ConditionalNumber.State.SHOWN), new ConditionalFeature(null, state), set2.contains(ClipUploadScreenFeature$PostingRedirectBanner.b), false, false, true, false, new ConditionalFeature(new AutoRepostToStoriesData(lweVar.j(), null, 2, null), set2.contains(ClipUploadScreenFeature$AutoRepostToStoryWithLikes.b) ? ConditionalFeature.State.SHOWN : state), false, false), set2);
            }
        }
        hgfVar = new hgf(lgfVar, continuationImpl);
        Object obj2 = hgfVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hgfVar.label;
        if (i != 0) {
        }
        MediaUtils.d a22 = two0.a(Collections.singletonList(d), 0.5625f);
        lwo0 lwo0Var2 = new lwo0(lgfVar.o);
        Uri fromFile2 = Uri.fromFile(file);
        long j2 = d.f * 1000;
        VideoEncodedItem videoEncodedItem2 = new VideoEncodedItem(new TrackMediaSource(fromFile2, -1), 0L, j2, 1.0d, null, 16, null);
        AudioItem audioItem2 = new AudioItem(new TrackMediaSource(fromFile2, -1), 0L, j2, 1.0d, 1.0f, null, 32, null);
        meg megVar2 = new meg(lwo0Var2);
        megVar2.c(videoEncodedItem2);
        megVar2.a(audioItem2);
        Timeline b22 = megVar2.b().b();
        String absolutePath2 = file.getAbsolutePath();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
        mediaMetadataRetriever2.setDataSource(absolutePath2);
        ref$ObjectRef2.element = MediaUtils.a.i(0L, mediaMetadataRetriever2, a22);
        s3q0 s3q0Var2 = s3q0.a;
        mediaMetadataRetriever2.release();
        Bitmap bitmap2 = (Bitmap) ref$ObjectRef2.element;
        File file32 = new File(lffVar.b(PrivateSubdir.TEMP_UPLOADS), UUID.randomUUID().toString());
        com.vk.stories.b.a.getClass();
        f = com.vk.stories.b.f(bitmap2, file32);
        if (f != null) {
        }
    }

    @Override // xsna.dl50, xsna.mn50
    public final boolean B(hn50 hn50Var) {
        return !(this.b.getCurrentState() instanceof ClipsUploadState.Loaded);
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        mjf.c cVar = (mjf.c) hn50Var;
        return m(myc0.h(this.f, this.d.c().plus(iyx.a()).plus(new igf(this, cVar)), null, new jgf(this, cVar, null), 2));
    }
}
