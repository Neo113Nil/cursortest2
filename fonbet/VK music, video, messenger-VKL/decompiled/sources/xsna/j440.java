package xsna;

import com.vk.auth.validation.VkValidateRouterInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.QuestionInfo;
import com.vk.dto.stories.model.StoryUploadType;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.entities.StoryEditorParams;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.story.api.media.StoryMediaData;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class j440 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ j440(u440 u440Var, ArrayList arrayList, boolean z) {
        this.d = u440Var;
        this.e = arrayList;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UserId userId;
        QuestionInfo questionInfo;
        switch (this.b) {
            case 0:
                u440 u440Var = (u440) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                Pair pair = (Pair) obj;
                int intValue = ((Number) pair.d()).intValue();
                StoryMediaData storyMediaData = (StoryMediaData) pair.g();
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"MultiStory", "doShare onNext " + intValue + ' ' + storyMediaData});
                }
                CommonUploadParams commonUploadParams = u440Var.d;
                arrayList.set(intValue, storyMediaData);
                g440 g440Var = (g440) u440Var.s;
                g440Var.ik();
                List V = j5g.V(arrayList);
                if (((ArrayList) V).size() == u440Var.v.size()) {
                    boolean z = this.c;
                    if (!z) {
                        u440Var.D7().i(StoryEditorEvents.CHOOSE_RECEIVERS);
                    }
                    commonUploadParams.k = u440Var.x.h() ? StoryUploadType.PUBLISH_TO_DIALOG : z ? StoryUploadType.PUBLISH_NOW : StoryUploadType.PUBLISH_WITH_RECEIVERS;
                    StoryMediaData storyMediaData2 = (StoryMediaData) j5g.b0(0, V);
                    if (storyMediaData2 != null) {
                        ArrayList arrayList2 = storyMediaData2.d.v;
                        if (arrayList2 == null || (questionInfo = (QuestionInfo) arrayList2.get(0)) == null || (userId = questionInfo.c) == null) {
                            userId = UserId.d;
                        }
                        if (fkq0.b(userId)) {
                            commonUploadParams.e = fkq0.e(userId);
                        }
                    }
                    u440Var.j.p(new StoryMultiData(V, new StoryEditorParams(g440Var.getLayoutWidth(), g440Var.getLayoutHeight()), u440Var.d, 0, Integer.valueOf(u440Var.Q.c), 8, null), u440Var.w, z);
                }
                break;
            default:
                x3a0 x3a0Var = (x3a0) this.d;
                String str = (String) this.e;
                VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) obj;
                sir0 sir0Var = sir0.a;
                ctu0 ctu0Var = x3a0Var.y;
                VkValidateRouterInfo.EnterSmsCode enterSmsCode = new VkValidateRouterInfo.EnterSmsCode(vkAuthValidatePhoneResult.b, false, this.c, vkAuthValidatePhoneResult, str);
                sir0Var.getClass();
                ctu0Var.d(enterSmsCode, true);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ j440(x3a0 x3a0Var, boolean z, String str) {
        this.d = x3a0Var;
        this.c = z;
        this.e = str;
    }
}
