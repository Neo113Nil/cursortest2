package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.log.L;
import com.vk.medianative.MediaImageEncoder;
import com.vk.photo.editor.features.mlenhance.MlEnhanceDelegate;
import com.vk.photo.editor.features.mlenhance.a;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$LongRef;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.d4p;

/* compiled from: MlEnhanceToolDelegate.kt */
/* loaded from: classes15.dex */
public final class gt20 implements MlEnhanceDelegate, w8i {
    public final boolean b;
    public final Context c;
    public final qiw d;
    public final boolean e;
    public final h7v f;
    public dt20 g;
    public io.reactivex.rxjava3.disposables.c h;
    public final HashMap<String, io.reactivex.rxjava3.disposables.c> i = new HashMap<>();
    public final bpn0 j = new bpn0(new s1x(this, 11));

    /* compiled from: MlEnhanceToolDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MlEnhanceDelegate.OnboardingResource.values().length];
            try {
                iArr[MlEnhanceDelegate.OnboardingResource.Pic1Original.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MlEnhanceDelegate.OnboardingResource.Pic1Enhanced.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MlEnhanceDelegate.OnboardingResource.Pic2Original.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MlEnhanceDelegate.OnboardingResource.Pic2Enhanced.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MlEnhanceToolDelegate.kt */
    public static final class b implements io.reactivex.rxjava3.functions.f {
        public final /* synthetic */ izs b;

        public b(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final /* synthetic */ void accept(Object obj) {
            this.b.invoke(obj);
        }
    }

    public gt20(boolean z, Context context, qiw qiwVar, boolean z2, h7v h7vVar) {
        this.b = z;
        this.c = context;
        this.d = qiwVar;
        this.e = z2;
        this.f = h7vVar;
    }

    public static final d4p.a f(gt20 gt20Var, Bitmap bitmap) {
        PrivateFiles.a b2;
        d4p.a aVar;
        gt20Var.d.getClass();
        b2 = e8r.a.b(r0, PrivateSubdir.PHOTO_EDITOR.h(), true);
        File file = new File(b2.a, System.currentTimeMillis() + ".png");
        try {
        } catch (Throwable th) {
            L.i(th);
            aVar = null;
        }
        if (!MediaImageEncoder.INSTANCE.encodeJpegWithoutCompression(bitmap, file)) {
            throw new IllegalStateException("Can't render bitmap to jpeg");
        }
        aVar = new d4p.a(file.getAbsolutePath());
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Can't save bitmap to file");
    }

    @Override // com.vk.photo.editor.features.mlenhance.MlEnhanceDelegate
    public final void a(Bitmap bitmap, com.vk.photo.editor.features.mlenhance.d dVar) {
        if (this.e) {
            myc0.h(q1u.b, bdn.b, null, new ht20(bitmap, this, dVar, null), 2);
            return;
        }
        dt20 dt20Var = this.g;
        if (dt20Var != null) {
            dt20Var.a();
        }
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = System.currentTimeMillis();
        io.reactivex.rxjava3.internal.operators.observable.g1 T = io.reactivex.rxjava3.core.q.T(bitmap);
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = T.a0(asu0Var.c()).U(new com.vk.movika.sdk.base.ui.j(new kt20(1, this, gt20.class, "writeBitmapToFile", "writeBitmapToFile(Landroid/graphics/Bitmap;)Lcom/vk/photo/editor/EditorImageFileSaver$FileInfo;", 0), 28));
        tmz tmzVar = new tmz(new r3h(ref$LongRef, 26), 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.h = U.E(tmzVar, lVar, kVar, kVar).L(new d22(new mgz(this, 6), 26), false).t0(1L).y0(10L, TimeUnit.MINUTES).E(new pm1(new f1j(ref$LongRef, 29), 28), lVar, kVar, kVar).L(new q9(new nt10(this, 2), 21), false).E(new lkz(new mi10(ref$LongRef, 1), 3), lVar, kVar, kVar).U(new p5w(new lt20(1, this, gt20.class, "writeBitmapToFile", "writeBitmapToFile(Landroid/graphics/Bitmap;)Lcom/vk/photo/editor/EditorImageFileSaver$FileInfo;", 0), 2)).E(new pdw(new jjx(ref$LongRef, 8), 3), lVar, kVar, kVar).a0(asu0Var.d()).U(new vx6(new kpr(9), 23)).subscribe(new w00(new it20(1, dVar, MlEnhanceDelegate.a.class, "onSuccess", "onSuccess(Lcom/vk/photo/editor/domain/EditorImageLink;)V", 0), 26), new gf0(new jt20(1, dVar, MlEnhanceDelegate.a.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0), 26));
    }

    @Override // com.vk.photo.editor.features.mlenhance.MlEnhanceDelegate
    public final boolean b() {
        return this.b;
    }

    @Override // com.vk.photo.editor.features.mlenhance.MlEnhanceDelegate
    public final void c() {
        dt20 dt20Var = this.g;
        if (dt20Var != null) {
            dt20Var.a();
        }
        this.g = null;
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
        this.h = null;
        HashMap<String, io.reactivex.rxjava3.disposables.c> hashMap = this.i;
        for (io.reactivex.rxjava3.disposables.c cVar2 : hashMap.values()) {
            if (!cVar2.h()) {
                cVar2.dispose();
            }
        }
        hashMap.clear();
    }

    @Override // com.vk.photo.editor.features.mlenhance.MlEnhanceDelegate
    public final LottieAnimationView d() {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(this.c);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        lottieAnimationView.V(new udy("**"), t800.I, new a900(new upj0(lottieAnimationView.getContext().getColor(R.color.vk_white))));
        lottieAnimationView.setAnimation(R.raw.editor_ml_enhance_loader);
        lottieAnimationView.m0();
        return lottieAnimationView;
    }

    @Override // com.vk.photo.editor.features.mlenhance.MlEnhanceDelegate
    public final Object e(MlEnhanceDelegate.OnboardingResource onboardingResource, a.C1462a c1462a) {
        String str;
        String str2;
        Hint p = this.f.p(HintId.PHOTO_EDITOR_ML_ENHANCE_ONBOARDING.getId());
        Map<String, String> map = p != null ? p.e : null;
        int i = a.$EnumSwitchMapping$0[onboardingResource.ordinal()];
        if (i == 1) {
            str = "pic1_original";
        } else if (i == 2) {
            str = "pic1_enhanced";
        } else {
            if (i != 3) {
                if (i == 4) {
                    str = "pic2_enhanced";
                }
                return null;
            }
            str = "pic2_original";
        }
        if (map != null && (str2 = map.get(str)) != null) {
            gzg0 gzg0Var = new gzg0(s7s0.c(c1462a));
            HashMap<String, io.reactivex.rxjava3.disposables.c> hashMap = this.i;
            io.reactivex.rxjava3.disposables.c cVar = hashMap.get(str2);
            if (cVar != null && !cVar.h()) {
                cVar.dispose();
            }
            io.reactivex.rxjava3.core.q<Bitmap> h = mcr0.h(Uri.parse(str2));
            asu0 asu0Var = asu0.a;
            hashMap.put(str2, h.a0(asu0Var.d()).r0(asu0Var.c()).subscribe(new b(new mt20(this, str2, gzg0Var)), new b(new nt20(gzg0Var))));
            Object a2 = gzg0Var.a();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return a2;
        }
        return null;
    }
}
