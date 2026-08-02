package xsna;

import com.vk.core.view.components.text.VkText;
import com.vk.newsfeed.posting.impl.presentation.model.PostingTextRestriction;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class vnc0 extends FunctionReferenceImpl implements izs<PostingTextRestriction, s3q0> {
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final s3q0 invoke(PostingTextRestriction postingTextRestriction) {
        PostingTextRestriction postingTextRestriction2 = postingTextRestriction;
        j8c0 j8c0Var = (j8c0) this.receiver;
        VkText vkText = j8c0Var.a;
        boolean z = postingTextRestriction2 instanceof PostingTextRestriction.Visible;
        if (z) {
            StringBuilder sb = new StringBuilder();
            PostingTextRestriction.Visible visible = (PostingTextRestriction.Visible) postingTextRestriction2;
            sb.append(visible.d());
            sb.append('/');
            sb.append(visible.e());
            vkText.setText(sb.toString());
            Integer valueOf = visible instanceof PostingTextRestriction.Visible.Restricted ? Integer.valueOf(((Number) j8c0Var.c.getValue()).intValue()) : visible instanceof PostingTextRestriction.Visible.NotRestricted ? Integer.valueOf(((Number) j8c0Var.b.getValue()).intValue()) : null;
            if (valueOf != null) {
                vkText.setTextColor(valueOf.intValue());
            }
        }
        if (bwt0.K(vkText) != z) {
            j6r0.d(vkText, z ? 0 : 8, false, 300, null);
        }
        return s3q0.a;
    }
}
