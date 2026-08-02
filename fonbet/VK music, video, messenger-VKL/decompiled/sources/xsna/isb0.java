package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.stories.dto.StoriesGetQuestionsExtendedResponseDto;
import com.vk.api.generated.stories.dto.StoriesQuestionDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.user.UserProfile;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.tabbar.core.api.domain.TabbarState;
import com.vk.tabbar.core.api.domain.TabbarSuggestApplyState;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vk.voip.ui.call_list.scheduled.ScheduledScreenSharingMuteOption;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.gyw0;
import xsna.iyw0;
import xsna.jto0;
import xsna.tsb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class isb0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ isb0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                PollAttachment pollAttachment = (PollAttachment) obj3;
                onb0 onb0Var = (onb0) obj;
                ysg0.b.a(new zrb0(onb0Var.a));
                pollAttachment.f = onb0Var.a;
                ((lsb0) obj2).U(new tsb0.a(pollAttachment));
                break;
            case 1:
                pbc0 pbc0Var = (pbc0) obj2;
                View view = (View) obj;
                float f = -(view.getX() - ((RecyclerView) obj3).getPaddingStart());
                view.setTranslationX(f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ofFloat.addUpdateListener(new rlc(view, 2));
                ofFloat.setDuration(pbc0Var.c);
                ofFloat.setInterpolator(pbc0Var.a);
                xo2.h(ofFloat, new com.vk.movika.sdk.android.defaultplayer.container.e(20, pbc0Var, view));
                break;
            case 2:
                ikc0 ikc0Var = (ikc0) obj3;
                ikc0Var.a0.add((wjg0) obj2);
                ikc0Var.A1((Attachment) obj);
                break;
            case 3:
                break;
            case 4:
                StoriesGetQuestionsExtendedResponseDto storiesGetQuestionsExtendedResponseDto = (StoriesGetQuestionsExtendedResponseDto) obj;
                osl0 osl0Var = (osl0) ((zgm0) obj3).c.d.getValue();
                int i3 = ((rqe0) obj2).d;
                j2r0 j2r0Var = osl0Var.a;
                List<UsersUserFullDto> e = storiesGetQuestionsExtendedResponseDto.e();
                j2r0Var.getClass();
                LinkedHashMap b = j2r0.b(e);
                List<StoriesQuestionDto> d = storiesGetQuestionsExtendedResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (StoriesQuestionDto storiesQuestionDto : d) {
                    int id = storiesQuestionDto.getId();
                    boolean g = storiesQuestionDto.g();
                    String e2 = storiesQuestionDto.e();
                    UserId q = storiesQuestionDto.q();
                    Boolean i4 = storiesQuestionDto.i();
                    Boolean bool = Boolean.TRUE;
                    boolean f2 = epx.f(i4, bool);
                    UserId q2 = storiesQuestionDto.q();
                    UserProfile userProfile = q2 != null ? (UserProfile) b.get(q2) : null;
                    boolean f3 = epx.f(storiesQuestionDto.j(), bool);
                    boolean f4 = epx.f(storiesQuestionDto.f(), bool);
                    Integer d2 = storiesQuestionDto.d();
                    arrayList.add(new StoryQuestionEntry(id, q, e2, g, f2, userProfile, f3, f4, d2 != null ? d2.intValue() : 0));
                }
                VKList vKList = new VKList(arrayList);
                vKList.o(storiesGetQuestionsExtendedResponseDto.getCount());
                vKList.l(vKList.size() + i3 < storiesGetQuestionsExtendedResponseDto.getCount());
                vKList.n("");
                break;
            case 5:
                hnm0 hnm0Var = (hnm0) obj3;
                lrl0 lrl0Var = hnm0Var.a;
                StoriesContainer storiesContainer = (StoriesContainer) obj2;
                StoriesContainer storiesContainer2 = (StoriesContainer) j5g.a0(((GetStoriesResponse) obj).c);
                if (storiesContainer2 != null) {
                    lrl0Var.m(storiesContainer2);
                    break;
                } else {
                    lrl0Var.c(storiesContainer);
                    hnm0Var.c.a();
                    break;
                }
            case 6:
                vvn0 vvn0Var = (vvn0) obj3;
                TabbarSuggestApplyState tabbarSuggestApplyState = (TabbarSuggestApplyState) obj2;
                TabbarState tabbarState = vvn0Var.k;
                if (tabbarState != null) {
                    vvn0Var.a.d(tabbarState, false);
                    vvn0Var.j.onNext(s3q0.a);
                }
                vvn0Var.i.onNext(tabbarSuggestApplyState);
                break;
            case 7:
                ((i0b0) obj3).invoke(jto0.b.a((jto0.b) obj2, null, null, null, null, false, null, false, false, false, false, null, false, ((Boolean) obj).booleanValue(), false, null, false, 61439));
                break;
            case 8:
                View view2 = (View) obj3;
                gla glaVar = (gla) obj2;
                if (!g620.f().k0().a(view2.getContext())) {
                    glaVar.onClick(view2);
                }
                break;
            case 9:
                ((u8r0) obj3).p((String) obj2, null, (BadgeInfo) obj);
                break;
            case 10:
                TextView textView = (TextView) obj2;
                Bitmap g2 = kd7.g((Activity) obj3, Bitmap.createScaledBitmap((Bitmap) obj, gbg0.a(textView.getResources(), 28.0f), gbg0.a(textView.getResources(), 28.0f), false));
                if (g2 != null) {
                    int b2 = (int) iah0.b(0.5f);
                    int c = dhr0.t.c(R.attr.vk_ui_image_border_alpha);
                    int i5 = b2 * 2;
                    int width = g2.getWidth() + i5;
                    int height = g2.getHeight() + i5;
                    Bitmap.Config config = g2.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint c2 = x9.c(true);
                    c2.setColor(c);
                    canvas.drawCircle(width / 2, height / 2, Math.min(width, height) / 2.0f, c2);
                    float f5 = b2;
                    canvas.drawBitmap(g2, f5, f5, (Paint) null);
                    break;
                }
                break;
            case 11:
                ((y990) obj3).a(((wns0) obj2).getBindingAdapterPosition());
                break;
            case 12:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj3;
                VideoFile videoFile = (VideoFile) obj2;
                Iterator it = ((List) obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                    } else if (!epx.f(((czs0) it.next()).a.a1(), videoFile.a1())) {
                        i2++;
                    }
                }
                if (i2 == -1) {
                    gVar.v0();
                }
                break;
            case 13:
                gzs gzsVar = (gzs) obj2;
                if (((VideoNewProfileHeaderViewV2) obj3).u && gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            case 14:
                ((f6w0) obj3).b.c((VmojiProductModel) obj2);
                break;
            default:
                cyw0 cyw0Var = (cyw0) obj3;
                iyw0.a aVar = (iyw0.a) obj;
                boolean z = aVar.h.a;
                boolean z2 = !z;
                ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption = !z ? ScheduledScreenSharingMuteOption.Enabled : ScheduledScreenSharingMuteOption.DisabledPermanent;
                cyw0Var.T(new gyw0.h(new iyw0.a.C3088a(z2, scheduledScreenSharingMuteOption)));
                cyw0.V(cyw0Var, null, null, null, null, null, null, scheduledScreenSharingMuteOption, null, null, aVar, 447);
                break;
        }
        return s3q0.a;
    }
}
