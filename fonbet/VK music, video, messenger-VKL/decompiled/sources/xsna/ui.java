package xsna;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.CalendarContract;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.generated.messages.dto.MessagesEditCallMuteAudioDto;
import com.vk.api.generated.messages.dto.MessagesEditCallMuteScreenSharingDto;
import com.vk.api.generated.messages.dto.MessagesEditCallMuteVideoDto;
import com.vk.api.generated.messages.dto.MessagesEditCallRecurrenceRuleDto;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.im.ui.themes.AccentColor;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.call_list.scheduled.ScheduledScreenSharingMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a7f0;
import xsna.fxw0;
import xsna.iv00;
import xsna.k65;
import xsna.q7h0;
import xsna.tww0;
import xsna.vav;
import xsna.xav;
import xsna.xn50;

/* compiled from: AccentColorAdapter.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class ui extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03d2 A[LOOP:3: B:153:0x03c6->B:158:0x03d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0411 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03b8  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        final int i;
        boolean z;
        iv00.b bVar;
        hfz hfzVar;
        vv00 vv00Var;
        boolean z2;
        iv00.b bVar2;
        List<? extends hfz> list;
        MarketBridgeCategory marketBridgeCategory;
        MarketBridgeCategory marketBridgeCategory2;
        List<? extends hfz> list2;
        Object obj2;
        List<? extends hfz> list3;
        MessagesEditCallRecurrenceRuleDto messagesEditCallRecurrenceRuleDto;
        MessagesEditCallMuteVideoDto messagesEditCallMuteVideoDto;
        MessagesEditCallMuteAudioDto messagesEditCallMuteAudioDto;
        MessagesEditCallMuteScreenSharingDto messagesEditCallMuteScreenSharingDto;
        tfx tfxVar;
        tfx tfxVar2;
        MessagesEditCallRecurrenceRuleDto messagesEditCallRecurrenceRuleDto2;
        switch (this.b) {
            case 0:
                AccentColor accentColor = (AccentColor) obj;
                vi viVar = (vi) this.receiver;
                int i2 = viVar.d;
                viVar.d = viVar.c.indexOf(accentColor);
                viVar.notifyItemChanged(i2);
                viVar.notifyItemChanged(viVar.d);
                AccentColor a = ba3.a();
                if (!epx.f(a != null ? a.name() : null, accentColor.name())) {
                    if (accentColor == AccentColor.NOT_SET) {
                        Iterator it = ba3.a.entrySet().iterator();
                        while (it.hasNext()) {
                            ((Map.Entry) it.next()).setValue(null);
                        }
                    } else {
                        int h = accentColor.h();
                        Iterator it2 = ba3.a.entrySet().iterator();
                        while (it2.hasNext()) {
                            ((Map.Entry) it2.next()).setValue(Integer.valueOf(h));
                        }
                    }
                    zdw zdwVar = i7o0.b;
                    if (zdwVar == null) {
                        zdwVar = null;
                    }
                    cew cewVar = zdwVar.u;
                    String name = accentColor.name();
                    cewVar.getClass();
                    SharedPreferences.Editor edit = cew.h().edit();
                    if (name != null) {
                        edit.putString("pref_app_accent_color_name", name);
                    } else {
                        edit.remove("pref_app_accent_color_name");
                    }
                    edit.apply();
                    dhr0 dhr0Var = dhr0.a;
                    dhr0Var.getClass();
                    dhr0.p0(dhr0Var, null, dhr0.C(), null, 12);
                }
                return s3q0.a;
            case 1:
                ((xgx0) this.receiver).getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 2:
                k65 k65Var = (k65) obj;
                u55 u55Var = (u55) this.receiver;
                ws1 ws1Var = u55Var.c;
                String str = ws1Var.c;
                String str2 = ws1Var.a;
                p600 p600Var = u55Var.a;
                if (epx.f(k65Var, k65.g.a)) {
                    p600Var.update(k65.e.a);
                } else if (k65Var instanceof k65.d) {
                    String str3 = ((k65.d) k65Var).a;
                    try {
                        uf7 c = u55Var.b.c();
                        u55Var.d = c;
                        Uri.Builder encodedPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority(ws1Var.b).encodedPath("oidc/authorize");
                        encodedPath.appendQueryParameter("client_id", str2);
                        encodedPath.appendQueryParameter(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "code");
                        encodedPath.appendQueryParameter("nonce", str3);
                        fo70.a(encodedPath, c);
                        encodedPath.appendQueryParameter("redirect_uri", str);
                        encodedPath.appendQueryParameter(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, "openid profile phone email role_fl");
                        p600Var.update(new k65.h(encodedPath.build()));
                    } catch (Exception unused) {
                        p600Var.update(new k65.a("Could not generate secure data.", 2));
                    }
                } else if (k65Var instanceof k65.c) {
                    Uri uri = ((k65.c) k65Var).a;
                    uf7 uf7Var = u55Var.d;
                    if (uf7Var == null) {
                        p600Var.update(new k65.a("No secure data.", 2));
                    } else {
                        String queryParameter = uri.getQueryParameter("code");
                        String queryParameter2 = uri.getQueryParameter("state");
                        p600Var.update(queryParameter == null ? new k65.a("Code is null.", 2) : queryParameter2 == null ? new k65.a("State is null.", 2) : !queryParameter2.equals((String) uf7Var.a) ? new k65.a("State value does not match.", 2) : new k65.b(queryParameter, (String) uf7Var.b, str2, str));
                    }
                }
                return s3q0.a;
            case 3:
                ((m99) this.receiver).getClass();
                return Boolean.valueOf(m99.m(obj));
            case 4:
                vav vavVar = (vav) obj;
                ((fvq) this.receiver).getClass();
                if (!(vavVar instanceof vav.d)) {
                    return xav.a.a;
                }
                vav.d dVar = (vav.d) vavVar;
                xav.b.C3990b c3990b = new xav.b.C3990b(dVar.b.a);
                vav.a aVar = dVar.c;
                return new xav.b(c3990b, new xav.b.a(aVar.a, aVar.b));
            case 5:
                List<? extends hfz> list4 = (List) obj;
                iv00 iv00Var = (iv00) this.receiver;
                iv00Var.n1 = false;
                LinkedList<gzs<s3q0>> linkedList = iv00Var.m1;
                linkedList.clear();
                Iterator<? extends hfz> it3 = list4.iterator();
                int i3 = 0;
                while (true) {
                    i = -1;
                    if (!it3.hasNext()) {
                        i3 = -1;
                    } else if (!((vv00) it3.next()).f) {
                        i3++;
                    }
                }
                if (i3 > -1) {
                    vv00 vv00Var2 = (vv00) list4.get(i3);
                    iv00.b bVar3 = iv00Var.j1;
                    if (bVar3 != null && (list3 = bVar3.h) != null) {
                        List<? extends hfz> list5 = list3;
                        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                            for (hfz hfzVar2 : list5) {
                                vv00 vv00Var3 = hfzVar2 instanceof vv00 ? (vv00) hfzVar2 : null;
                                if (vv00Var3 == null || vv00Var3.e != 0) {
                                    z = true;
                                    bVar = iv00Var.j1;
                                    if (bVar != null || (list2 = bVar.h) == null) {
                                        hfzVar = null;
                                    } else {
                                        Iterator<T> it4 = list2.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                obj2 = it4.next();
                                                hfz hfzVar3 = (hfz) obj2;
                                                vv00 vv00Var4 = hfzVar3 instanceof vv00 ? (vv00) hfzVar3 : null;
                                                if (vv00Var4 == null || !vv00Var4.f) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        hfzVar = (hfz) obj2;
                                    }
                                    vv00Var = !(hfzVar instanceof vv00) ? (vv00) hfzVar : null;
                                    if (vv00Var2.e == 0 && vv00Var != null && vv00Var.e != 0) {
                                        marketBridgeCategory = vv00Var.h;
                                        while (true) {
                                            if (marketBridgeCategory != null) {
                                                MarketBridgeCategory marketBridgeCategory3 = marketBridgeCategory.g;
                                                if (marketBridgeCategory3 != null) {
                                                    marketBridgeCategory2 = marketBridgeCategory3.g;
                                                    if (marketBridgeCategory2 != null) {
                                                        marketBridgeCategory = marketBridgeCategory.g;
                                                    } else if (marketBridgeCategory != null && marketBridgeCategory.b == vv00Var2.b) {
                                                        z2 = true;
                                                        iv00.b bVar4 = iv00Var.j1;
                                                        hfz hfzVar4 = (bVar4 != null || (list = bVar4.h) == null) ? null : (hfz) j5g.b0(i3, list);
                                                        vv00 vv00Var5 = hfzVar4 instanceof vv00 ? (vv00) hfzVar4 : null;
                                                        boolean z3 = vv00Var5 == null && ((vv00) list4.get(i3)).b == vv00Var5.b && vv00Var5.f;
                                                        if (vv00Var2.e == 0 || !z || z3 || z2) {
                                                            bVar2 = iv00Var.j1;
                                                            if (bVar2 != null) {
                                                                bVar2.setItems(list4);
                                                            }
                                                            if (iv00Var.k1 == null && !iv00Var.o1 && ((vv00) list4.get(i3)).e == 0) {
                                                                linkedList.add(new hv00(iv00Var, i3, 0));
                                                            }
                                                        } else {
                                                            RecyclerView recyclerView = iv00Var.l1;
                                                            if (recyclerView != null) {
                                                                recyclerView.post(new nek(2, iv00Var, list4));
                                                            }
                                                            linkedList.add(new sfz(iv00Var, list4, i3));
                                                        }
                                                    }
                                                }
                                            }
                                            marketBridgeCategory2 = null;
                                            if (marketBridgeCategory2 != null) {
                                            }
                                        }
                                    }
                                    z2 = false;
                                    iv00.b bVar42 = iv00Var.j1;
                                    if (bVar42 != null) {
                                    }
                                    if (hfzVar4 instanceof vv00) {
                                    }
                                    if (vv00Var5 == null) {
                                    }
                                    if (vv00Var2.e == 0) {
                                    }
                                    bVar2 = iv00Var.j1;
                                    if (bVar2 != null) {
                                    }
                                    if (iv00Var.k1 == null) {
                                        linkedList.add(new hv00(iv00Var, i3, 0));
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    bVar = iv00Var.j1;
                    if (bVar != null) {
                    }
                    hfzVar = null;
                    if (!(hfzVar instanceof vv00)) {
                    }
                    if (vv00Var2.e == 0) {
                        marketBridgeCategory = vv00Var.h;
                        while (true) {
                            if (marketBridgeCategory != null) {
                            }
                            marketBridgeCategory2 = null;
                            if (marketBridgeCategory2 != null) {
                            }
                            marketBridgeCategory = marketBridgeCategory.g;
                        }
                    }
                    z2 = false;
                    iv00.b bVar422 = iv00Var.j1;
                    if (bVar422 != null) {
                    }
                    if (hfzVar4 instanceof vv00) {
                    }
                    if (vv00Var5 == null) {
                    }
                    if (vv00Var2.e == 0) {
                    }
                    bVar2 = iv00Var.j1;
                    if (bVar2 != null) {
                    }
                    if (iv00Var.k1 == null) {
                    }
                } else {
                    iv00.b bVar5 = iv00Var.j1;
                    if (bVar5 != null) {
                        bVar5.setItems(list4);
                    }
                }
                Integer num = iv00Var.k1;
                if (num != null) {
                    int intValue = num.intValue();
                    Iterator<? extends hfz> it5 = list4.iterator();
                    int i4 = 0;
                    while (true) {
                        if (it5.hasNext()) {
                            if (((vv00) it5.next()).b == intValue) {
                                i = i4;
                            } else {
                                i4++;
                            }
                        }
                    }
                    if (i >= 0) {
                        iv00Var.k1 = null;
                        final boolean z4 = ((vv00) list4.get(i)).e == 0;
                        final RecyclerView recyclerView2 = iv00Var.l1;
                        if (recyclerView2 != null) {
                            recyclerView2.post(new Runnable() { // from class: xsna.gv00
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i5 = iv00.p1;
                                    boolean z5 = z4;
                                    RecyclerView recyclerView3 = recyclerView2;
                                    int height = z5 ? 0 : recyclerView3.getHeight() / 3;
                                    RecyclerView.o layoutManager = recyclerView3.getLayoutManager();
                                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                                    int i6 = i;
                                    if (linearLayoutManager != null) {
                                        linearLayoutManager.K(i6, height);
                                    } else {
                                        recyclerView3.scrollToPosition(i6);
                                    }
                                }
                            });
                        }
                    }
                }
                iv00Var.o1 = false;
                return s3q0.a;
            case 6:
                m740 m740Var = (m740) this.receiver;
                m740Var.getClass();
                xn50.a.c(m740Var, (k740) obj);
                return s3q0.a;
            case 7:
                ((dv60) this.receiver).c((xh60) obj);
                return s3q0.a;
            case 8:
                m8a0 m8a0Var = (m8a0) this.receiver;
                m8a0Var.getClass();
                xn50.a.c(m8a0Var, (i8a0) obj);
                return s3q0.a;
            case 9:
                return ((vpc0) this.receiver).f((PostingState) obj);
            case 10:
                pii0 pii0Var = (pii0) this.receiver;
                pii0Var.getClass();
                xn50.a.c(pii0Var, (nii0) obj);
                return s3q0.a;
            default:
                fxw0 fxw0Var = (fxw0) obj;
                final pww0 pww0Var = (pww0) this.receiver;
                pww0Var.getClass();
                if (fxw0Var instanceof fxw0.a) {
                    fxw0.a aVar2 = (fxw0.a) fxw0Var;
                    CallId callId = aVar2.b;
                    String str4 = aVar2.d;
                    boolean z5 = !aVar2.o;
                    boolean z6 = aVar2.p;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    long seconds = timeUnit.toSeconds(aVar2.e);
                    mvo0 mvo0Var = aVar2.f;
                    Long valueOf = mvo0Var != null ? Long.valueOf(timeUnit.toSeconds(mvo0Var.a)) : null;
                    ScheduledCallRecurrence scheduledCallRecurrence = aVar2.j;
                    boolean z7 = aVar2.m;
                    boolean z8 = aVar2.n;
                    ScheduledAudioMuteOption scheduledAudioMuteOption = aVar2.s;
                    ScheduledVideoMuteOption scheduledVideoMuteOption = aVar2.t;
                    long seconds2 = timeUnit.toSeconds(aVar2.g);
                    mvo0 mvo0Var2 = aVar2.k;
                    Long valueOf2 = mvo0Var2 != null ? Long.valueOf(timeUnit.toSeconds(mvo0Var2.a)) : null;
                    ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption = aVar2.x;
                    boolean z9 = aVar2.y;
                    boolean z10 = aVar2.z;
                    pww0Var.i.getClass();
                    if (myc0.f(drm0.p0(str4).toString())) {
                        vg20 vg20Var = pww0Var.f.a;
                        String str5 = callId.b;
                        int i5 = (int) seconds2;
                        if (scheduledCallRecurrence != null) {
                            switch (q7h0.b.$EnumSwitchMapping$3[scheduledCallRecurrence.ordinal()]) {
                                case 1:
                                    messagesEditCallRecurrenceRuleDto2 = MessagesEditCallRecurrenceRuleDto.DAILY;
                                    break;
                                case 2:
                                    messagesEditCallRecurrenceRuleDto2 = MessagesEditCallRecurrenceRuleDto.WEEKLY;
                                    break;
                                case 3:
                                    messagesEditCallRecurrenceRuleDto2 = MessagesEditCallRecurrenceRuleDto.WEEKDAYS;
                                    break;
                                case 4:
                                    messagesEditCallRecurrenceRuleDto2 = MessagesEditCallRecurrenceRuleDto.WEEKEND;
                                    break;
                                case 5:
                                    messagesEditCallRecurrenceRuleDto2 = MessagesEditCallRecurrenceRuleDto.MONTHLY;
                                    break;
                                case 6:
                                    messagesEditCallRecurrenceRuleDto2 = MessagesEditCallRecurrenceRuleDto.YEARLY;
                                    break;
                                default:
                                    messagesEditCallRecurrenceRuleDto2 = MessagesEditCallRecurrenceRuleDto.NEVER;
                                    break;
                            }
                            messagesEditCallRecurrenceRuleDto = messagesEditCallRecurrenceRuleDto2;
                        } else {
                            messagesEditCallRecurrenceRuleDto = null;
                        }
                        int i6 = q7h0.b.$EnumSwitchMapping$0[scheduledVideoMuteOption.ordinal()];
                        if (i6 == 1) {
                            messagesEditCallMuteVideoDto = MessagesEditCallMuteVideoDto.MUTE;
                        } else if (i6 == 2) {
                            messagesEditCallMuteVideoDto = MessagesEditCallMuteVideoDto.MUTE_PERMANENT;
                        } else {
                            if (i6 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            messagesEditCallMuteVideoDto = MessagesEditCallMuteVideoDto.UNMUTE;
                        }
                        MessagesEditCallMuteVideoDto messagesEditCallMuteVideoDto2 = messagesEditCallMuteVideoDto;
                        int i7 = q7h0.b.$EnumSwitchMapping$1[scheduledAudioMuteOption.ordinal()];
                        if (i7 == 1) {
                            messagesEditCallMuteAudioDto = MessagesEditCallMuteAudioDto.MUTE;
                        } else if (i7 == 2) {
                            messagesEditCallMuteAudioDto = MessagesEditCallMuteAudioDto.MUTE_PERMANENT;
                        } else {
                            if (i7 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            messagesEditCallMuteAudioDto = MessagesEditCallMuteAudioDto.UNMUTE;
                        }
                        MessagesEditCallMuteAudioDto messagesEditCallMuteAudioDto2 = messagesEditCallMuteAudioDto;
                        int i8 = q7h0.b.$EnumSwitchMapping$2[scheduledScreenSharingMuteOption.ordinal()];
                        if (i8 == 1) {
                            messagesEditCallMuteScreenSharingDto = MessagesEditCallMuteScreenSharingDto.MUTE;
                        } else if (i8 == 2) {
                            messagesEditCallMuteScreenSharingDto = MessagesEditCallMuteScreenSharingDto.MUTE_PERMANENT;
                        } else {
                            if (i8 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            messagesEditCallMuteScreenSharingDto = MessagesEditCallMuteScreenSharingDto.UNMUTE;
                        }
                        Boolean valueOf3 = Boolean.valueOf(z5);
                        Long valueOf4 = Long.valueOf(seconds);
                        Integer valueOf5 = Integer.valueOf(i5);
                        Boolean valueOf6 = Boolean.valueOf(z8);
                        Boolean valueOf7 = Boolean.valueOf(z7);
                        Boolean valueOf8 = Boolean.valueOf(z6);
                        Boolean valueOf9 = Boolean.valueOf(z9);
                        Boolean valueOf10 = Boolean.valueOf(z10);
                        vg20Var.getClass();
                        tfx tfxVar3 = new tfx("messages.editCall", new pm0(22), new tf3(20));
                        tfx.o(tfxVar3, "call_id", str5, 0, 0, 12);
                        tfxVar3.j("only_auth_users", valueOf3.booleanValue());
                        if (str4 != null) {
                            tfxVar = tfxVar3;
                            tfx.o(tfxVar, "name", str4, 0, 0, 12);
                        } else {
                            tfxVar = tfxVar3;
                        }
                        if (valueOf != null) {
                            tfx.m(tfxVar, "marker_time", valueOf.longValue(), 0L, 12);
                        }
                        tfx.m(tfxVar, "time", valueOf4.longValue(), 0L, 12);
                        tfx.l(tfxVar, "duration", valueOf5.intValue(), 0, 0, 12);
                        if (valueOf2 != null) {
                            tfx.m(tfxVar, "recurrence_until_time", valueOf2.longValue(), 0L, 12);
                        }
                        if (messagesEditCallRecurrenceRuleDto != null) {
                            tfx.o(tfxVar, "recurrence_rule", messagesEditCallRecurrenceRuleDto.i(), 0, 0, 12);
                        }
                        tfx tfxVar4 = tfxVar;
                        tfxVar4.j("skip_notification", valueOf6.booleanValue());
                        tfxVar4.j("waiting_hall", valueOf7.booleanValue());
                        if (messagesEditCallMuteAudioDto2 != null) {
                            tfxVar2 = tfxVar4;
                            tfx.o(tfxVar2, "mute_audio", messagesEditCallMuteAudioDto2.i(), 0, 0, 12);
                        } else {
                            tfxVar2 = tfxVar4;
                        }
                        if (messagesEditCallMuteVideoDto2 != null) {
                            tfx.o(tfxVar2, "mute_video", messagesEditCallMuteVideoDto2.i(), 0, 0, 12);
                        }
                        if (messagesEditCallMuteScreenSharingDto != null) {
                            tfx.o(tfxVar2, "mute_screen_sharing", messagesEditCallMuteScreenSharingDto.i(), 0, 0, 12);
                        }
                        tfx tfxVar5 = tfxVar2;
                        tfxVar5.j("feedback", valueOf8.booleanValue());
                        tfxVar5.j("only_admin_can_record", valueOf9.booleanValue());
                        tfxVar5.j(SignalingProtocol.KEY_SHOW_CHAT_HISTORY, valueOf10.booleanValue());
                        io.reactivex.rxjava3.internal.operators.observable.b1 Z = rsg0.Z(yfb.x(tfxVar5));
                        final u98 u98Var = pww0Var.j;
                        final f1x0 V = pww0Var.V(aVar2);
                        u98Var.getClass();
                        final String str6 = V.h;
                        a7f0.a.f(pww0Var, new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(Z.e(((str6 == null || !((bsb0) u98Var.c).a()) ? io.reactivex.rxjava3.core.x.k(V) : new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.sz8
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                u98 u98Var2 = u98.this;
                                hfw0 hfw0Var = (hfw0) j5g.a0(((qz8) u98Var2.b).b(str6));
                                Long valueOf11 = hfw0Var != null ? Long.valueOf(hfw0Var.a) : null;
                                f1x0 f1x0Var = V;
                                if (valueOf11 == null) {
                                    return f1x0Var;
                                }
                                qz8 qz8Var = (qz8) u98Var2.b;
                                Uri withAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, valueOf11.longValue());
                                ContentResolver contentResolver = qz8Var.a;
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("title", f1x0Var.a);
                                contentValues.put("description", f1x0Var.b);
                                contentValues.put("rrule", f1x0Var.c);
                                contentValues.put("allDay", Boolean.valueOf(f1x0Var.d));
                                contentValues.put("dtstart", Long.valueOf(f1x0Var.e));
                                contentValues.put("dtend", Long.valueOf(f1x0Var.f));
                                contentValues.put("duration", (Integer) null);
                                contentResolver.update(withAppendedId, contentValues, null, null);
                                return new f1x0(f1x0Var.a, f1x0Var.b, f1x0Var.c, f1x0Var.d, f1x0Var.e, f1x0Var.f, valueOf11, f1x0Var.h);
                            }
                        }).q(io.reactivex.rxjava3.schedulers.a.b())).l(new u9c0(new btl0(6, pww0Var, fxw0Var), 10))).m(asu0.a.d()), new pd40(new q9i0(pww0Var, 20), 22)), new io.reactivex.rxjava3.functions.a() { // from class: xsna.oww0
                            @Override // io.reactivex.rxjava3.functions.a
                            public final void run() {
                                pww0.this.T(tww0.l.a.b);
                            }
                        }), new q99(1, pww0Var.n, f4z.class, "notify", "notify(Ljava/lang/Object;)V", 0, 7), new jnb(pww0Var, 12), 1);
                    } else {
                        pww0Var.T(tww0.g.b);
                        pww0Var.T(tww0.h.b);
                    }
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(Object obj, int i) {
        super(1, obj, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(1, obj, fvq.class, "transform", "transform(Lcom/vk/voip/ui/holiday_interaction/feature/HolidayInteractionFeatureState;)Lcom/vk/voip/ui/holiday_interaction/performance/HolidayInteractionPerfomanceState;", 0);
                break;
            case 5:
                super(1, obj, iv00.class, "bindCategories", "bindCategories(Ljava/util/List;)V", 0);
                break;
            case 6:
            case 8:
            default:
                break;
            case 7:
                super(1, obj, dv60.class, "sendEvent", "sendEvent(Lcom/vk/mvi/MviEvent;)V", 0);
                break;
            case 9:
                super(1, obj, vpc0.class, "mapToolbarViewState", "mapToolbarViewState(Lcom/vk/newsfeed/posting/impl/domain/model/PostingState;)Lcom/vk/newsfeed/posting/impl/presentation/model/PostingToolbarViewState;", 0);
                break;
        }
    }
}
