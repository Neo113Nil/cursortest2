package xsna;

import android.content.Intent;
import android.view.View;
import com.vk.profile.community.impl.ui.tag.CommunityActionTags;
import com.vk.upload.StoryUploadActivity;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CommunityHeaderSharedItemsFactory.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class b4h extends FunctionReferenceImpl implements wzs {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ b4h(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((d3h) this.receiver).f((View) obj, (CommunityActionTags) obj2);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Intent intent = (Intent) obj2;
                StoryUploadActivity storyUploadActivity = (StoryUploadActivity) this.receiver;
                int i = StoryUploadActivity.x;
                if (booleanValue) {
                    storyUploadActivity.setResult(-1, intent);
                }
                storyUploadActivity.finish();
                break;
        }
        return s3q0.a;
    }

    public b4h(Object obj) {
        super(2, obj, d3h.class, "handleActionButton", "handleActionButton(Landroid/view/View;Lcom/vk/profile/community/impl/ui/tag/CommunityActionTags;)V", 0);
    }
}
