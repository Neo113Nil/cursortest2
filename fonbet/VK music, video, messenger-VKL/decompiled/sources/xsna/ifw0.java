package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import com.vk.core.ui.themes.ThemableActivity;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.ui.asr_online.AsrOnlineView;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.groupcalls.grid.GroupCallGridContainerView;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerView;
import com.vk.voip.ui.share.link.pager.view.a;
import com.vk.voip.ui.whiteboard.presentation.main.ui.WhiteboardFragment;
import com.vk.voip.ui.whiteboard.presentation.main.ui.b;
import com.vkontakte.android.R;
import com.vkontakte.android.data.FriendsUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.commons.http.Http;
import ru.ok.gl.tf.Tensorflow;
import xsna.cw3;
import xsna.mjw0;
import xsna.xsw0;
import xsna.yv3;
import xsna.zew0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ifw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ifw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ed, code lost:
    
        if (xsna.myc0.f(r1) != false) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04da  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        Object obj2;
        kvp kvpVar;
        zew0 c;
        UserProfile userProfile;
        com.vk.voip.ui.share.link.pager.view.b bVar;
        int i = this.b;
        Object obj3 = null;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                VoipCallActivity voipCallActivity = (VoipCallActivity) obj4;
                mlp mlpVar = (mlp) obj;
                int i2 = VoipCallActivity.P;
                voipCallActivity.getClass();
                UserProfile userProfile2 = (UserProfile) j5g.a0(mlpVar.e);
                int i3 = mlpVar.b;
                if (i3 == 928) {
                    if (userProfile2 != null ? epx.f(userProfile2.y, Boolean.FALSE) : false) {
                        a201.b().a().a(userProfile2.c, userProfile2.n);
                    }
                }
                Long n = arm0.n(mlpVar.d);
                List<UserProfile> list = mlpVar.e;
                String str2 = mlpVar.h;
                String str3 = mlpVar.c;
                kvp kvpVar2 = voipCallActivity.L;
                if (kvpVar2 != null && voipCallActivity.l) {
                    if (!(kvpVar2.b != null) && n != null) {
                        if (str3 != null) {
                            str = drm0.j0(str3, StringUtils.PROCESS_POSTFIX_DELIMITER, "");
                            break;
                        }
                        str = null;
                        ThemableActivity themableActivity = voipCallActivity.i;
                        FragmentManager supportFragmentManager = voipCallActivity.getSupportFragmentManager();
                        long longValue = n.longValue();
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (epx.f(((UserProfile) obj2).y, Boolean.FALSE)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        UserProfile userProfile3 = (UserProfile) obj2;
                        if (i3 == -13) {
                            c = zew0.a.b(zew0.k1, themableActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, themableActivity.getString(R.string.error_network), themableActivity.getString(R.string.error_description), null, new zew0.b.a(R.string.voip_understood), null, false, Http.StatusCode.RANGE_NOT_SATISFIABLE);
                        } else if (i3 == 4) {
                            c = zew0.k1.c(longValue, themableActivity);
                        } else if (i3 == 1) {
                            c = zew0.a.b(zew0.k1, themableActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, themableActivity.getString(R.string.voip_error_contact_doesnt_support_title), themableActivity.getString(R.string.voip_error_contact_doesnt_support_subtitle), null, new zew0.b.a(R.string.voip_error_contact_doesnt_support_ok), null, false, Http.StatusCode.RANGE_NOT_SATISFIABLE);
                        } else if (i3 == -5) {
                            c = zew0.a.b(zew0.k1, themableActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, themableActivity.getString(R.string.voip_call_already_finished), null, null, new zew0.b.a(R.string.voip_close), null, false, Tensorflow.FRAME_WIDTH);
                        } else if (i3 == 9) {
                            c = zew0.a.b(zew0.k1, themableActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, themableActivity.getString(R.string.voip_error_flood_control_title), themableActivity.getString(R.string.voip_error_flood_control_subtitle), null, zew0.a.a(longValue), null, false, Http.StatusCode.RANGE_NOT_SATISFIABLE);
                        } else if (i3 == -2) {
                            c = zew0.a.b(zew0.k1, themableActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, themableActivity.getString(R.string.voip_you_are_blocked), null, null, new zew0.b.a(R.string.voip_understood), null, false, Tensorflow.FRAME_WIDTH);
                        } else if (i3 == -3) {
                            c = zew0.a.b(zew0.k1, themableActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, themableActivity.getString(R.string.voip_waiting_room_label_waiting_rejected), null, null, new zew0.b.a(R.string.voip_understood), null, false, Tensorflow.FRAME_WIDTH);
                        } else {
                            if (i3 == -4) {
                                kvpVar = kvpVar2;
                                c = zew0.a.b(zew0.k1, themableActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, themableActivity.getString(R.string.voip_error_self_update_required_title), themableActivity.getString(R.string.voip_error_self_update_required_subtitle), str2, new zew0.b.a(R.string.voip_understood), null, false, 384);
                            } else {
                                kvpVar = kvpVar2;
                                if (i3 == -12) {
                                    c = zew0.a.b(zew0.k1, themableActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, themableActivity.getString(R.string.voip_error_participants_limit_reached), null, null, new zew0.b.a(R.string.voip_understood), null, false, Tensorflow.FRAME_WIDTH);
                                } else if (list.isEmpty()) {
                                    c = zew0.k1.c(longValue, themableActivity);
                                } else if (i3 == 926) {
                                    zew0.a aVar = zew0.k1;
                                    String b = FriendsUtils.b((UserProfile) j5g.Y(list), 12);
                                    c = zew0.a.b(aVar, themableActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, themableActivity.getString(R.string.voip_error_not_available_title, b), themableActivity.getString(R.string.voip_error_not_available_subtitle, b), null, zew0.a.a(longValue), null, false, Http.StatusCode.RANGE_NOT_SATISFIABLE);
                                } else if (i3 == 923) {
                                    zew0.a aVar2 = zew0.k1;
                                    UserProfile userProfile4 = (UserProfile) j5g.Y(list);
                                    c = zew0.a.b(aVar2, themableActivity, R.drawable.vk_icon_phone_outline_56, R.attr.vk_ui_icon_secondary, themableActivity.getString(R.string.voip_error_update_required_title, FriendsUtils.b(userProfile4, 12)), themableActivity.getString(userProfile4.K().booleanValue() ? R.string.voip_error_update_required_subtitle_f : R.string.voip_error_update_required_subtitle, userProfile4.d), null, zew0.a.a(longValue), null, false, Http.StatusCode.RANGE_NOT_SATISFIABLE);
                                } else if (i3 == 928) {
                                    if (userProfile3 == null) {
                                        Iterator it2 = list.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                userProfile = it2.next();
                                                if (epx.f(((UserProfile) userProfile).c, new UserId(longValue))) {
                                                }
                                            } else {
                                                userProfile = 0;
                                            }
                                        }
                                        userProfile3 = userProfile;
                                    }
                                    if (userProfile3 == null) {
                                        c = null;
                                    } else if (epx.f(str, "edu_callee_is_unavailable_by_its_schedule")) {
                                        c = zew0.a.b(zew0.k1, themableActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, themableActivity.getString(R.string.voip_error_edu_schedule_call_restriction_title), themableActivity.getString(R.string.voip_error_edu_schedule_call_restriction_subtitle), null, zew0.a.a(0L), null, true, 160);
                                    } else {
                                        c = zew0.a.b(zew0.k1, themableActivity, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, themableActivity.getString(R.string.voip_error_privacy_title, FriendsUtils.b(userProfile3, 12)), themableActivity.getString(userProfile3.K().booleanValue() ? R.string.voip_error_privacy_subtitle_f : R.string.voip_error_privacy_subtitle, userProfile3.d), null, zew0.a.a(longValue), null, true, 160);
                                    }
                                } else {
                                    c = zew0.k1.c(longValue, themableActivity);
                                }
                            }
                            kvpVar.b = c;
                            if (c != null) {
                                c.j1 = kvpVar.a;
                                c.Td(supportFragmentManager, "");
                                s3q0 s3q0Var = s3q0.a;
                            }
                        }
                        kvpVar = kvpVar2;
                        kvpVar.b = c;
                        if (c != null) {
                        }
                    }
                }
                return s3q0.a;
            case 1:
                mjw0 mjw0Var = (mjw0) obj4;
                ListGroupCallView listGroupCallView = mjw0Var.f;
                GroupCallGridContainerView groupCallGridContainerView = mjw0Var.e;
                GroupCallViewModel.GroupCallViewMode groupCallViewMode = (GroupCallViewModel.GroupCallViewMode) obj;
                int i4 = groupCallViewMode == null ? -1 : mjw0.b.$EnumSwitchMapping$0[groupCallViewMode.ordinal()];
                if (i4 == 1) {
                    SpannableStringBuilder subtitlesTextSpannable = listGroupCallView.getSubtitlesTextSpannable();
                    AsrOnlineView asrOnlineView = groupCallGridContainerView.d.B;
                    if (subtitlesTextSpannable != null) {
                        asrOnlineView.b.setText("");
                        asrOnlineView.b.setText(subtitlesTextSpannable);
                        asrOnlineView.b.post(new kv3(asrOnlineView, 0));
                    } else {
                        asrOnlineView.getClass();
                    }
                } else if (i4 == 2) {
                    SpannableStringBuilder subtitlesTextSpannable2 = groupCallGridContainerView.getSubtitlesTextSpannable();
                    AsrOnlineView asrOnlineView2 = listGroupCallView.K;
                    if (subtitlesTextSpannable2 != null) {
                        asrOnlineView2.b.setText("");
                        asrOnlineView2.b.setText(subtitlesTextSpannable2);
                        asrOnlineView2.b.post(new kv3(asrOnlineView2, 0));
                    } else {
                        asrOnlineView2.getClass();
                    }
                }
                return s3q0.a;
            case 2:
                yv3 yv3Var = (yv3) obj;
                ((xjw0) obj4).getClass();
                if (yv3Var instanceof yv3.b.a) {
                    yv3.b.a aVar3 = (yv3.b.a) yv3Var;
                    obj3 = new cw3.c(aVar3.a, aVar3.b);
                } else if (yv3Var instanceof yv3.b.C4138b) {
                    yv3.b.C4138b c4138b = (yv3.b.C4138b) yv3Var;
                    obj3 = new cw3.a(c4138b.a, c4138b.b, c4138b.c, c4138b.d);
                }
                return new it80(obj3);
            case 3:
                VoipPastCallsFragment.b bVar2 = ((VoipPastCallsFragment) obj4).Q;
                sp.g((bVar2 != null ? bVar2 : null).b, 0);
                return s3q0.a;
            case 4:
                VoipShareLinkPagerView voipShareLinkPagerView = (VoipShareLinkPagerView) obj4;
                String str4 = voipShareLinkPagerView.i;
                if (str4 != null && (bVar = voipShareLinkPagerView.h) != null) {
                    bVar.a(new a.c(str4));
                }
                return s3q0.a;
            default:
                b.InterfaceC2093b interfaceC2093b = (b.InterfaceC2093b) obj;
                com.vk.voip.ui.whiteboard.presentation.main.ui.a aVar4 = ((WhiteboardFragment) obj4).Q;
                if (aVar4 != null) {
                    io.reactivex.rxjava3.disposables.b bVar3 = aVar4.d;
                    Context context = aVar4.g;
                    xsw0 xsw0Var = aVar4.b;
                    FragmentManager fragmentManager = aVar4.a;
                    ImageView imageView = aVar4.i;
                    View view = aVar4.l;
                    View view2 = aVar4.h;
                    if (interfaceC2093b.equals(b.InterfaceC2093b.a.a)) {
                        bwt0.p0(view2, true);
                    } else if (interfaceC2093b instanceof b.InterfaceC2093b.c) {
                        b.InterfaceC2093b.c cVar = (b.InterfaceC2093b.c) interfaceC2093b;
                        view.setBackgroundResource(R.color.vk_gray_50);
                        imageView.setImageTintList(ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_button_icon)));
                        bwt0.p0(view2, false);
                        if (fragmentManager.H("Whiteboard") == null) {
                            bVar3.b(io.reactivex.rxjava3.kotlin.c.h(xsw0Var.b(new xsw0.b(new WeakReference(context), cVar.a)), null, new u5p0(aVar4, 26), 1));
                        }
                    } else {
                        if (!(interfaceC2093b instanceof b.InterfaceC2093b.C2094b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        b.InterfaceC2093b.C2094b c2094b = (b.InterfaceC2093b.C2094b) interfaceC2093b;
                        view.setBackgroundColor(Color.parseColor("#f8f9fb"));
                        imageView.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.vk_azure_300)));
                        bwt0.p0(view2, false);
                        if (fragmentManager.H("Whiteboard") == null) {
                            bVar3.b(io.reactivex.rxjava3.kotlin.c.h(xsw0Var.a(new xsw0.a(new WeakReference(context), c2094b.a)), null, new tzq0(aVar4, 13), 1));
                        }
                    }
                }
                return s3q0.a;
        }
    }
}
