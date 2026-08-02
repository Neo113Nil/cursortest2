package xsna;

import com.vk.clips.design.compose.upload.ClipsUploadButtonType;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsUploadButton.kt */
/* loaded from: classes16.dex */
public final class odf {

    /* compiled from: ClipsUploadButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsUploadButtonType.values().length];
            try {
                iArr[ClipsUploadButtonType.Upload.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsUploadButtonType.Draft.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final String str, final gzs gzsVar, final ClipsUploadButtonType clipsUploadButtonType, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        ButtonStyle buttonStyle;
        androidx.compose.runtime.a M = aVar.M(881573186);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.l(z) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(881573186, i2, -1, "com.vk.clips.design.compose.upload.ClipsUploadButton (ClipsUploadButton.kt:24)");
            }
            ButtonSize buttonSize = ButtonSize.Large;
            int i3 = a.$EnumSwitchMapping$0[clipsUploadButtonType.ordinal()];
            if (i3 == 1) {
                buttonStyle = ButtonStyle.Primary;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                buttonStyle = ButtonStyle.Secondary;
            }
            aVar2 = M;
            bhu0.e(gzsVar, buttonSize, buttonStyle, ButtonAppearance.Accent, q630Var, null, false, false, null, null, null, str, null, null, null, null, z, null, null, null, aVar2, ((i2 >> 3) & 14) | 3120 | (57344 & i2), ((i2 << 6) & 896) | ((i2 << 12) & 29360128), 0, 4059104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(str, gzsVar, clipsUploadButtonType, z, q630Var, i) { // from class: xsna.ndf
                public final /* synthetic */ String b;
                public final /* synthetic */ gzs c;
                public final /* synthetic */ ClipsUploadButtonType d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(385);
                    odf.a(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
