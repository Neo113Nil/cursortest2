package xsna;

import android.view.View;
import com.vk.profile.community.impl.ui.tag.CommunityActionTags;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipProfileToolbar.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class ibd extends FunctionReferenceImpl implements wzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibd(Object obj, int i) {
        super(2, obj, ebd.class, "getComposeAnnotatedDescription", "getComposeAnnotatedDescription(Ljava/lang/String;Z)Lcom/vk/core/compose/annotated/VkAnnotatedStringBuilder;", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(2, obj, d3h.class, "handleActionButton", "handleActionButton(Landroid/view/View;Lcom/vk/profile/community/impl/ui/tag/CommunityActionTags;)V", 0);
                break;
            default:
                break;
        }
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                return ebd.m((ebd) this.receiver, (String) obj, booleanValue);
            default:
                ((d3h) this.receiver).f((View) obj, (CommunityActionTags) obj2);
                return s3q0.a;
        }
    }
}
