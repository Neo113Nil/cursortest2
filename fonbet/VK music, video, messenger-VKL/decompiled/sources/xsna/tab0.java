package xsna;

import android.text.Spanned;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PlaylistListContent.kt */
/* loaded from: classes3.dex */
public abstract class tab0 {
    public static final float d = 8;
    public final mtk0<Spanned> a;
    public final mtk0<Integer> b;
    public final FunctionReferenceImpl c;

    /* JADX WARN: Multi-variable type inference failed */
    public tab0(mtk0<? extends Spanned> mtk0Var, mtk0<Integer> mtk0Var2, izs<? super String, s3q0> izsVar) {
        this.a = mtk0Var;
        this.b = mtk0Var2;
        this.c = (FunctionReferenceImpl) izsVar;
    }

    public abstract void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);

    public final us2 b(int i, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1896075289, i, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistListContent.getSummaryString (PlaylistListContent.kt:31)");
        }
        Spanned value = this.a.getValue();
        VkTypographyToken vkTypographyToken = VkTypographyToken.ParagraphNormal;
        klv0 klv0Var = new klv0(vkTypographyToken, VkColorToken.TextPrimary);
        klv0 klv0Var2 = new klv0(vkTypographyToken, VkColorToken.TextLink);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1065943337, 0, -1, "com.vk.music.playlist.framework.presentation.toAnnotatedString (Util.kt:40)");
        }
        s8u0 s8u0Var = new s8u0(0);
        int i2 = s8u0Var.i(klv0Var);
        try {
            s8u0Var.e(value.toString());
            for (Object obj : value.getSpans(0, value.length(), qjc.class)) {
                qjc qjcVar = (qjc) obj;
                s8u0Var.d(klv0Var2, value.getSpanStart(qjcVar), value.getSpanEnd(qjcVar));
                String a = qjg.a(qjcVar);
                String i3 = qjcVar.i();
                if (i3 == null) {
                    i3 = "";
                }
                s8u0Var.c(value.getSpanStart(qjcVar), value.getSpanEnd(qjcVar), a, i3);
            }
            s3q0 s3q0Var = s3q0.a;
            s8u0Var.f(i2);
            us2 j = s8u0Var.j(8, aVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return j;
        } catch (Throwable th) {
            s8u0Var.f(i2);
            throw th;
        }
    }
}
