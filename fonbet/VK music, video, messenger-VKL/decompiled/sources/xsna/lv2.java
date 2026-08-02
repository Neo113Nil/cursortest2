package xsna;

import android.graphics.Bitmap;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.questions.dto.QuestionsQuestionDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.stories.model.StoryQuestionAnswer;
import com.vk.im.engine.models.groups.AdminLevel;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vkontakte.android.R;
import java.util.Arrays;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class lv2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lv2(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 0;
        switch (this.b) {
            case 0:
                com.vk.profile.questions.impl.a aVar = (com.vk.profile.questions.impl.a) this.d;
                boolean z = this.c;
                UsersUserFullDto usersUserFullDto = aVar.g1;
                if (usersUserFullDto == null) {
                    usersUserFullDto = null;
                }
                Owner owner = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
                owner.b = usersUserFullDto.s1();
                Serializer.c<Image> cVar = Image.CREATOR;
                owner.g = Image.b.a(usersUserFullDto.r2());
                boolean z2 = usersUserFullDto.R2() == BaseBoolIntDto.YES;
                Boolean o3 = usersUserFullDto.o3();
                owner.f = new VerifyInfo(z2, false, o3 != null ? o3.booleanValue() : false, false, false, false, 58, null);
                owner.c = rq.a(usersUserFullDto, new StringBuilder(), ' ');
                owner.m = usersUserFullDto.D0();
                owner.n = usersUserFullDto.x1();
                QuestionsQuestionDto questionsQuestionDto = aVar.h1;
                if (questionsQuestionDto == null) {
                    questionsQuestionDto = null;
                }
                VkInputSelect vkInputSelect = aVar.m1;
                if (vkInputSelect == null) {
                    vkInputSelect = null;
                }
                String d = cqm0.d(String.valueOf(vkInputSelect.getText()));
                if (z) {
                    StoryQuestionAnswer storyQuestionAnswer = new StoryQuestionAnswer(Integer.valueOf(questionsQuestionDto.getId()), owner, questionsQuestionDto.f(), d, epx.f(questionsQuestionDto.j(), Boolean.TRUE), null, 32, null);
                    StorySharingInfo storySharingInfo = new StorySharingInfo(11, Long.valueOf(owner.b.b), null, null, String.format("https://%s/question/ask", Arrays.copyOf(new Object[]{a0a.d}, 1)) + o25.a().c().b, "", "questions", "", false, true);
                    com.vk.storycamera.builder.a aVar2 = new com.vk.storycamera.builder.a(MobileOfficialAppsCoreNavStat$EventScreen.QUESTION_MY, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.PROFILE_QUESTION);
                    aVar2.g = xa4.t();
                    aVar2.f = StoryCameraMode.STORY;
                    aVar2.I = true;
                    aVar2.U = false;
                    aVar2.i = storySharingInfo;
                    aVar2.i0 = storyQuestionAnswer;
                    aVar2.C(aVar.requireContext());
                    aVar.dismiss();
                    aVar.bo(SchemeStat$TypeQuestionItem.Type.NEXT);
                } else {
                    UserId i2 = questionsQuestionDto.i();
                    int id = questionsQuestionDto.getId();
                    VkButton vkButton = aVar.k1;
                    if (vkButton == null) {
                        vkButton = null;
                    }
                    aVar.Zn(false);
                    vkButton.setText(R.string.questions_action_answer_sending);
                    jjc.g(vkButton, new jt(2));
                    mjr mjrVar = aVar.j1;
                    if (mjrVar != null) {
                        e4 e4Var = new e4(aVar, 3);
                        mjrVar.d = rsg0.y0(yfb.x(((tqe0) mjrVar.e.getValue()).a(id, i2, d)), null, null, 3).subscribe(new ov2(new nv2(i, new mv2(aVar, id, i), e4Var), i), new pv2(new hb(e4Var, 3), i));
                    }
                }
                break;
            case 1:
                break;
            case 2:
                k86 k86Var = (k86) this.d;
                boolean z3 = this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    u440 u440Var = (u440) k86Var;
                    for (Group group : u440Var.t6().b) {
                        if (group.q0) {
                            u440Var.x0.put(group.c, Boolean.TRUE);
                        }
                        if (group.c0) {
                            u440Var.y0.put(group.c, Boolean.TRUE);
                        }
                    }
                }
                if (!z3) {
                    k86Var.i.postDelayed(new o86(k86Var, booleanValue && !k86Var.j.x().e()), 500L);
                }
                break;
            case 3:
                break;
            case 4:
                nxb0 nxb0Var = (nxb0) this.d;
                boolean z4 = this.c;
                nyb0 nyb0Var = nxb0Var.b;
                nyb0Var.b.getClass();
                nxb0Var.b(nyb0.a(nyb0Var, null, new yp2(z4, false), false, 1));
                break;
            default:
                com.vk.camera.editor.stories.impl.background.b.Z((com.vk.camera.editor.stories.impl.background.b) this.d, (Bitmap) obj, this.c, 8);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lv2(boolean z, AdminLevel adminLevel) {
        this.b = 3;
        this.c = z;
        this.d = adminLevel;
    }
}
