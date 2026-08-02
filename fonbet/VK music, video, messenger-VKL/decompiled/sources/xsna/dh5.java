package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.api.generated.vkRun.dto.VkRunSetStepsResponseDto;
import com.vk.channels.api.Channel;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.cell.button.group.VkCellButtonGroupLayout;
import com.vk.core.view.components.cell.button.group.VkGroupItem;
import com.vk.dto.common.id.UserId;
import com.vk.dzenarticle.impl.ui.view.ad.TopAdView;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h;
import com.vk.toggle.b;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.ui.broadcast.fragments.scheduled.BroadcastScheduledFragment;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedbackSource;
import xsna.drz;
import xsna.qdd;
import xsna.sza;
import xsna.t5r;
import xsna.tlo0;
import xsna.vre;
import xsna.w3s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dh5 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ dh5(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        b.d i;
        String obj2;
        String str;
        UserId userId;
        switch (this.b) {
            case 0:
                VideoPipStateHolder.State state = (VideoPipStateHolder.State) obj;
                if (state != VideoPipStateHolder.State.NONE && state != VideoPipStateHolder.State.OPENED) {
                    r5 = false;
                }
                return Boolean.valueOf(r5);
            case 1:
                int i2 = BroadcastScheduledFragment.U;
                return Boolean.valueOf(((it80) obj).a != 0);
            case 2:
                Context context = (Context) obj;
                VkCellButtonGroupLayout vkCellButtonGroupLayout = new VkCellButtonGroupLayout(context, null, 6);
                vkCellButtonGroupLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                for (int i3 = 0; i3 < 3; i3++) {
                    VkGroupItem vkGroupItem = new VkGroupItem(context, null, 6);
                    vkGroupItem.setText("Button");
                    VkGroupItem.a(vkGroupItem, Integer.valueOf(R.drawable.vk_icon_attach_24));
                    VkGroupItem.b(vkGroupItem, Integer.valueOf(R.drawable.vk_icon_dropdown_outline_16), VkGroupItem.IconType.Dropdown, 2);
                    vkGroupItem.setOnClickListener(new o44(0));
                    vkCellButtonGroupLayout.addView(vkGroupItem, vkCellButtonGroupLayout.generateLayoutParams((AttributeSet) null));
                }
                return vkCellButtonGroupLayout;
            case 3:
                return new sza.b.c((Channel) obj);
            case 4:
                Calendar d = pvo0.d();
                d.add(12, 1);
                return Boolean.valueOf(yl10.a(d.getTimeInMillis(), ((Date) obj).getTime()));
            case 5:
                qdd.f.onNext(qdd.f.RESTORE);
                return s3q0.a;
            case 6:
                b.a aVar = (b.a) obj;
                if (aVar == null || puq.b() || (i = com.vk.toggle.b.A.i(aVar)) == null || (obj2 = i.c.toString()) == null) {
                    return null;
                }
                return arm0.m(10, obj2);
            case 7:
                return s3q0.a;
            case 8:
                Integer num = ((vre.a) obj).g;
                int intValue = num != null ? num.intValue() : 0;
                tlo0.a aVar2 = tlo0.Companion;
                Object[] objArr = {xpm0.a(intValue)};
                aVar2.getClass();
                return tlo0.a.a(R.plurals.clips_playlist_ui_clips, intValue, objArr);
            case 9:
                return new io.reactivex.rxjava3.internal.operators.single.v(new y8f()).l(new sj4(new iz0((ShortVideoGetTemplateExtendedResponseDto) obj, 16), 5));
            case 10:
                String i4 = pvo0.i(false, (int) (((Long) obj).longValue() / 1000), false, true);
                if (i4.length() <= 0) {
                    return i4;
                }
                return ((Object) String.valueOf(i4.charAt(0)).toUpperCase(Locale.ROOT)) + i4.substring(1);
            case 11:
                L.j((Throwable) obj, "ClipsUploaderNew", "upload start failed");
                return s3q0.a;
            case 12:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).e);
            case 13:
                vzh vzhVar = (vzh) obj;
                Map<UserId, big0> map = vzhVar.z;
                yig0 yig0Var = vzhVar.y;
                big0 big0Var = map.get(yig0Var.c);
                UserId userId2 = yig0Var.c;
                if (big0Var == null || (userId = big0Var.a) == null || !fkq0.c(userId) || (str = big0Var.d) == null) {
                    str = "";
                }
                String str2 = big0Var != null ? big0Var.f : null;
                return new o4g0(userId2, vzhVar.A != null, str, str2 != null ? str2 : "");
            case 14:
                qgi0.r((tgi0) obj, "musicDynamicGridItemVhVkTileImage");
                return s3q0.a;
            case 15:
                Throwable th = ((gdj) obj).h;
                return new Pair(th, Boolean.valueOf(th != null));
            case 16:
                PublishState publishState = (PublishState) obj;
                return PublishState.a(publishState, null, null, k2k.b(publishState), null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -5, 2047);
            case 17:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_msg_header_menu_leave_chat);
            case 18:
                return Integer.valueOf(((spm) obj).a);
            case 19:
                return (xrm) ((drz.a) obj).a;
            case 20:
                jen jenVar = (jen) obj;
                return new h9b0(jenVar.i, jenVar.k, false, jenVar.q);
            case 21:
                ajp0 ajp0Var = (ajp0) obj;
                return new ajp0(ajp0Var.b, ajp0Var.c, ajp0Var.d, ajp0Var.e);
            case 22:
                qgi0.r((tgi0) obj, "donut_new_banner_about_button");
                return s3q0.a;
            case 23:
                TopAdView topAdView = new TopAdView((Context) obj, null, 0, 14, 0);
                topAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return topAdView;
            case 24:
                com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h hVar = (com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h) obj;
                h.a aVar3 = hVar.b;
                return Boolean.valueOf((!(aVar3 instanceof h.a.c) || (hVar.c.a instanceof g70) || epx.f(((h.a.c) aVar3).a.a().o, Boolean.TRUE)) ? false : true);
            case 25:
                t5r t5rVar = (t5r) obj;
                if (t5rVar instanceof t5r.b) {
                    String str3 = ((t5r.b) t5rVar).a;
                    com.vk.voip.ui.c.b.getClass();
                    u4x0 u4x0Var = com.vk.voip.ui.c.Y;
                    u4x0Var.h(false);
                    FeedbackManager feedbackManager = u4x0Var.b.getFeedbackManager();
                    if (feedbackManager != null) {
                        FeedbackManager.sendFeedback$default(feedbackManager, str3, ParticipantFeedbackSource.USER_CLICK, null, null, 12, null);
                    }
                    com.vk.voip.ui.c.j0().n0(str3);
                    yot yotVar = com.vk.voip.ui.c.Z().g;
                    if (!yotVar.g && ((Boolean) yotVar.a.invoke()).booleanValue()) {
                        if (!Preference.e(((UserId) yotVar.e.invoke()).b, FeatureId.GESTURE_FEEDBACK.h()).getBoolean("feature_used", false) && ((Boolean) yotVar.b.invoke()).booleanValue() && ((Boolean) yotVar.c.invoke()).booleanValue()) {
                            yotVar.g = true;
                            yotVar.f.onNext(s3q0.a);
                        }
                    }
                } else if (epx.f(t5rVar, t5r.c.a)) {
                    com.vk.voip.ui.c.b.getClass();
                    com.vk.voip.ui.c.A(!(com.vk.voip.ui.c.r.getParticipantStatesManager() != null ? r1.isOwnHandRaised() : false));
                } else {
                    if (!epx.f(t5rVar, t5r.a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.vk.voip.ui.c.b.getClass();
                    com.vk.voip.ui.c.Y.h(!r1.e);
                }
                return s3q0.a;
            case 26:
                return w3s.b.a;
            case 27:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((MediaStoreEntry) it.next()).getId()));
                }
                return j5g.M0(arrayList);
            case 28:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            default:
                int e = ((VkRunSetStepsResponseDto) obj).e();
                SimpleDateFormat simpleDateFormat = ehv0.a;
                return new ghv0(e, r1.d() / 1000.0f);
        }
    }

    public /* synthetic */ dh5(Object obj, int i) {
        this.b = i;
    }
}
