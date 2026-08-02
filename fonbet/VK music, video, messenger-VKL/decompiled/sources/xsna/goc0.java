package xsna;

import androidx.viewpager2.widget.ViewPager2;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final class goc0 extends ViewPager2.g {
    public final /* synthetic */ enc0 d;

    /* compiled from: PostingStep1View.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaPickerState.Tab.values().length];
            try {
                iArr[MediaPickerState.Tab.PhotoVk.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaPickerState.Tab.VideoVk.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaPickerState.Tab.LocalAlbum.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public goc0(enc0 enc0Var) {
        this.d = enc0Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        enc0 enc0Var = this.d;
        ?? r1 = enc0Var.n0;
        MediaPickerState.Tab tab = enc0.q0.get(i);
        int i2 = a.$EnumSwitchMapping$0[tab.ordinal()];
        if (i2 == 1) {
            ((ibc0) r1.getValue()).u().r();
        } else if (i2 == 2) {
            ((ibc0) r1.getValue()).u().M();
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ((ibc0) r1.getValue()).u().e();
        }
        enc0Var.g(tab);
        enc0.a(enc0Var);
        ahc0 ahc0Var = enc0Var.V;
        if (ahc0Var != null) {
            z1h0 F0 = ahc0Var.F0(i);
            qcs qcsVar = F0 instanceof qcs ? (qcs) F0 : null;
            if (qcsVar != null) {
                qcsVar.Vk();
            }
        }
    }
}
