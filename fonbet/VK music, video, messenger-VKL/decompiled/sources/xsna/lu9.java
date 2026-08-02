package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.dto.hints.Hint;
import com.vk.newsfeed.api.posting.viewpresenter.CropsForRatio;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import java.util.ArrayList;

/* compiled from: CarouselCropDelegate.kt */
/* loaded from: classes4.dex */
public final class lu9 {
    public final z84 a;
    public final j5d0 b;
    public final h7v c;
    public final zbc0 d;
    public k5d0 e;
    public final bgd f;
    public boolean g;
    public final SharedPreferences h;
    public final shk i;
    public PreviewRatio j;
    public thk k;
    public PreviewRatio l;
    public String m;
    public int n;

    /* compiled from: CarouselCropDelegate.kt */
    public static final class a {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return xq.c(')', this.a, new StringBuilder("AttachRatio(ratio="));
        }
    }

    public lu9(z84 z84Var, j5d0 j5d0Var, h7v h7vVar, zbc0 zbc0Var) {
        this.a = z84Var;
        this.b = j5d0Var;
        this.c = h7vVar;
        this.d = zbc0Var;
        bgd bgdVar = new bgd();
        bgdVar.a = new ArrayList();
        this.f = bgdVar;
        SharedPreferences f = Preference.f("crop_onboarding");
        this.h = f;
        this.i = new shk(h7vVar, f);
        this.m = "";
    }

    public static String c(PreviewRatio previewRatio) {
        if (previewRatio.c()) {
            return "original";
        }
        return previewRatio.b() + '_' + previewRatio.a() + "_auto";
    }

    public final kfk a() {
        k5d0 k5d0Var = this.e;
        ArrayList arrayList = null;
        if (k5d0Var != null) {
            ArrayList a2 = this.f.a(k5d0Var.a.get(k5d0Var.b));
            if (a2 != null && !a2.isEmpty()) {
                arrayList = a2;
            }
        }
        return new kfk(this.m, arrayList);
    }

    public final void b(PreviewRatio previewRatio) {
        this.e = new k5d0(this.b.e, previewRatio);
        shk shkVar = this.i;
        SharedPreferences sharedPreferences = shkVar.b;
        h7v h7vVar = shkVar.a;
        if (h7vVar.a(shkVar.c)) {
            int i = shkVar.f + 1;
            if (i < shkVar.e) {
                qaj0.c(sharedPreferences, "current_times_animation", Integer.valueOf(i));
                return;
            }
            Hint hint = shkVar.d;
            if (hint != null) {
                h7vVar.s(hint);
            }
            qaj0.c(sharedPreferences, "current_times_animation", 0);
        }
    }

    public final void d() {
        k5d0 k5d0Var = this.e;
        if (k5d0Var != null) {
            PreviewRatio previewRatio = k5d0Var.a.get(k5d0Var.b);
            CropsForRatio cropsForRatio = new CropsForRatio(previewRatio, this.f.a(previewRatio), null, null, 12, null);
            cropsForRatio.a = this.i.g;
            this.a.x0(cropsForRatio);
        }
    }
}
