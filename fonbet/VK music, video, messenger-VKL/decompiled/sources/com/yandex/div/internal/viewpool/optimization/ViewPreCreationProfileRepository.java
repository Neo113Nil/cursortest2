package com.yandex.div.internal.viewpool.optimization;

import android.content.Context;
import android.util.Log;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.logging.Severity;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Result;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.internal.WriteMode;
import xsna.bdn;
import xsna.bqz0;
import xsna.dmb;
import xsna.fpf0;
import xsna.fpm0;
import xsna.fvk;
import xsna.gvk;
import xsna.gzs;
import xsna.izs;
import xsna.j8y;
import xsna.mlb;
import xsna.myc0;
import xsna.n9y;
import xsna.o8y;
import xsna.olb;
import xsna.qmi0;
import xsna.s1v;
import xsna.s3q0;
import xsna.spj;
import xsna.st8;
import xsna.tt8;
import xsna.way;
import xsna.wgl;
import xsna.x7f0;
import xsna.yay;
import xsna.zcl;

/* compiled from: ViewPreCreationProfileRepository.kt */
/* loaded from: classes7.dex */
public class ViewPreCreationProfileRepository {
    private static final Companion Companion = new Companion(null);
    private static final WeakHashMap<String, fvk<ViewPreCreationProfile>> stores = new WeakHashMap<>();
    private final Context context;
    private final ViewPreCreationProfile defaultProfile;

    /* compiled from: ViewPreCreationProfileRepository.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final fvk<ViewPreCreationProfile> getStoreForId(final Context context, final String str) {
            WeakHashMap<String, fvk<ViewPreCreationProfile>> stores = getStores();
            fvk<ViewPreCreationProfile> fvkVar = stores.get(str);
            if (fvkVar == null) {
                fvkVar = gvk.a(ViewPreCreationProfileSerializer.INSTANCE, null, null, null, new gzs<File>() { // from class: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$Companion$getStoreForId$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // xsna.gzs
                    public final File invoke() {
                        return new File(context.getFilesDir(), String.format("divkit_optimized_viewpool_profile_%s.json", Arrays.copyOf(new Object[]{str}, 1)));
                    }
                }, 14);
                stores.put(str, fvkVar);
            }
            return fvkVar;
        }

        public final WeakHashMap<String, fvk<ViewPreCreationProfile>> getStores() {
            return ViewPreCreationProfileRepository.stores;
        }

        private Companion() {
        }
    }

    /* compiled from: ViewPreCreationProfileRepository.kt */
    public static final class ViewPreCreationProfileSerializer implements qmi0<ViewPreCreationProfile> {
        private static final ViewPreCreationProfile defaultValue = null;
        public static final ViewPreCreationProfileSerializer INSTANCE = new ViewPreCreationProfileSerializer();
        private static final j8y json = n9y.a(new izs<o8y, s3q0>() { // from class: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$ViewPreCreationProfileSerializer$json$1
            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(o8y o8yVar) {
                invoke2(o8yVar);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(o8y o8yVar) {
                o8yVar.a = false;
            }
        });

        private ViewPreCreationProfileSerializer() {
        }

        @Override // xsna.qmi0
        public Object readFrom(InputStream inputStream, spj<? super ViewPreCreationProfile> spjVar) {
            Object failure;
            try {
                j8y j8yVar = json;
                KSerializer p = s1v.p(j8yVar.b, fpf0.c(ViewPreCreationProfile.class));
                bqz0 bqz0Var = new bqz0(inputStream);
                dmb dmbVar = (dmb) bqz0Var.b;
                try {
                    x7f0 x7f0Var = new x7f0(bqz0Var, olb.c.e(16384));
                    try {
                        Object h = new fpm0(j8yVar, WriteMode.OBJ, x7f0Var, p.getDescriptor(), null).h(p);
                        x7f0Var.o();
                        x7f0Var.G();
                        dmbVar.getClass();
                        tt8.c.a(dmbVar.c.array());
                        failure = (ViewPreCreationProfile) h;
                    } catch (Throwable th) {
                        x7f0Var.G();
                        throw th;
                    }
                } catch (Throwable th2) {
                    dmbVar.getClass();
                    tt8.c.a(dmbVar.c.array());
                    throw th2;
                }
            } catch (Throwable th3) {
                failure = new Result.Failure(th3);
            }
            Throwable a = Result.a(failure);
            if (a != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                Log.e("OptimizedViewPreCreationProfileRepository", "", a);
            }
            if (failure instanceof Result.Failure) {
                return null;
            }
            return failure;
        }

        @Override // xsna.qmi0
        public /* bridge */ /* synthetic */ Object writeTo(ViewPreCreationProfile viewPreCreationProfile, OutputStream outputStream, spj spjVar) {
            return writeTo2(viewPreCreationProfile, outputStream, (spj<? super s3q0>) spjVar);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // xsna.qmi0
        public ViewPreCreationProfile getDefaultValue() {
            return defaultValue;
        }

        /* renamed from: writeTo, reason: avoid collision after fix types in other method */
        public Object writeTo2(ViewPreCreationProfile viewPreCreationProfile, OutputStream outputStream, spj<? super s3q0> spjVar) {
            Object failure;
            try {
                j8y j8yVar = json;
                KSerializer p = s1v.p(j8yVar.b, fpf0.c(ViewPreCreationProfile.class));
                yay yayVar = new yay(outputStream);
                byte[] bArr = yayVar.b;
                try {
                    way.a(j8yVar, yayVar, p, viewPreCreationProfile);
                    yayVar.e();
                    mlb.c.d(yayVar.c);
                    st8.c.a(bArr);
                    failure = s3q0.a;
                } catch (Throwable th) {
                    yayVar.e();
                    mlb.c.d(yayVar.c);
                    st8.c.a(bArr);
                    throw th;
                }
            } catch (Throwable th2) {
                failure = new Result.Failure(th2);
            }
            Throwable a = Result.a(failure);
            if (a != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                Log.e("OptimizedViewPreCreationProfileRepository", "", a);
            }
            return s3q0.a;
        }
    }

    public ViewPreCreationProfileRepository(Context context, ViewPreCreationProfile viewPreCreationProfile) {
        this.context = context;
        this.defaultProfile = viewPreCreationProfile;
    }

    public static Object get$suspendImpl(ViewPreCreationProfileRepository viewPreCreationProfileRepository, String str, spj<? super ViewPreCreationProfile> spjVar) {
        bdn bdnVar = bdn.a;
        return myc0.k(wgl.c, new ViewPreCreationProfileRepository$get$2(viewPreCreationProfileRepository, str, null), spjVar);
    }

    public Object get(String str, spj<? super ViewPreCreationProfile> spjVar) {
        return get$suspendImpl(this, str, spjVar);
    }
}
