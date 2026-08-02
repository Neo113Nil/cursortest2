package xsna;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.MsgReaction;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vk.im.ui.views.msg.MsgPartIconTwoRowView;
import com.vk.im.ui.views.msg.MsgStatus;
import com.vk.im.ui.views.msg.MsgStatusViewV2;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MsgItemBubbleCalculatorDefault.kt */
/* loaded from: classes2.dex */
public final class hk30 {
    public static final int u = iah0.a(40);
    public static final int v = iah0.a(30);
    public static final int w = iah0.a(600);
    public final Context a;
    public final com.vk.movika.sdk.android.defaultplayer.layout.a b;
    public final qyd0 c;
    public final u040 d;
    public final bpn0 e;
    public final StringBuilder f;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;
    public final bpn0 n;
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;
    public final bpn0 r;
    public final bpn0 s;
    public final bpn0 t;

    /* compiled from: MsgItemBubbleCalculatorDefault.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdapterEntryType.values().length];
            try {
                iArr[AdapterEntryType.TYPE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdapterEntryType.TYPE_AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdapterEntryType.TYPE_REACTIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdapterEntryType.TYPE_USER_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdapterEntryType.TYPE_REPLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_SENDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_CHANNEL_MSG_HEADER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_HEADER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_BUTTON_SHOW_ALL_REDESIGNED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AdapterEntryType.TYPE_NESTED_FORWARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AdapterEntryType.TYPE_FWD_BUTTON_SHOW_ALL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AdapterEntryType.TYPE_MSG_TRANSCRIPT_RATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AdapterEntryType.TYPE_AUDIOMSG_TRANSCRIPT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AdapterEntryType.TYPE_AUDIOMSG.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VIDEO_MSG.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[AdapterEntryType.TYPE_VIDEOMSG_TRANSCRIPT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[AdapterEntryType.TYPE_STICKER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[AdapterEntryType.TYPE_UGC_STICKER.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[AdapterEntryType.TYPE_POPUP_STICKER.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[AdapterEntryType.TYPE_GROUP_CALL.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[AdapterEntryType.TYPE_LINK_SMALL.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[AdapterEntryType.TYPE_WALL_POST_REPLY.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[AdapterEntryType.TYPE_CHANNEL_ATTACH_STUB_DOC.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DOC_SIMPLE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[AdapterEntryType.TYPE_EMPTY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[AdapterEntryType.TYPE_PLAYLIST.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[AdapterEntryType.TYPE_ARTIST.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[AdapterEntryType.TYPE_EXTERNAL_VIDEO.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[AdapterEntryType.TYPE_PUBLIC_VIDEO.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[AdapterEntryType.TYPE_INTERACTIVE_VIDEO.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[AdapterEntryType.TYPE_QUESTION.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[AdapterEntryType.TYPE_GRAFFITI.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[AdapterEntryType.TYPE_GIFT.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hk30(com.vk.movika.sdk.android.defaultplayer.layout.a aVar) {
        zdw zdwVar = i7o0.b;
        Context context = (zdwVar == null ? null : zdwVar).t;
        qyd0 qyd0Var = qyd0.a;
        a1w a1wVar = q1w.a;
        cau0 cau0Var = (a1wVar != null ? a1wVar : null).r().h;
        this.a = context;
        this.b = aVar;
        this.c = qyd0Var;
        this.d = new u040(context, t040.a);
        this.e = new bpn0(new atm(this, 20));
        this.f = new StringBuilder();
        this.g = new bpn0(new m1o(this, 19));
        this.h = new bpn0(new btm(this, 21));
        this.i = new bpn0(new b010(this, 2));
        this.j = new bpn0(new s1m(this, 25));
        this.k = new bpn0(new mxj(this, 28));
        this.l = new bpn0(new gbj(this, 27));
        new bpn0(new rf20(this, 1));
        this.m = new bpn0(new w8q(this, 22));
        this.n = new bpn0(new by20(this, 1));
        new bpn0(new b410(this, 1));
        new bpn0(new pp00(this, 5));
        new bpn0(new ln20(this, 1));
        this.o = new bpn0(new drg(this, 26));
        this.p = new bpn0(new s6y(this, 6));
        this.q = new bpn0(new gzv(this, 12));
        this.r = new bpn0(new x4u(this, 10));
        this.s = new bpn0(new Cnew(this, 8));
        this.t = new bpn0(new m130(this, 2));
    }

    public final int a(CharSequence charSequence) {
        CharSequence charSequence2;
        int i;
        if (charSequence == null || charSequence.length() == 0) {
            return 0;
        }
        if (charSequence.length() == 0 || drm0.N(charSequence)) {
            charSequence2 = "";
        } else {
            char[] cArr = {'\n', '\r'};
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = -1;
            while (true) {
                int i7 = i3 + 1;
                boolean z = i7 >= charSequence.length();
                boolean F = rl3.F(cArr, charSequence.charAt(i3));
                boolean z2 = !z && rl3.F(cArr, charSequence.charAt(i7));
                if (!F) {
                    if (i2 < 0 || i3 > i2 + 1) {
                        i6 = i3;
                    }
                    if ((z || z2) && (i = (i3 - i6) + 1) > i5) {
                        i5 = i;
                        i4 = i6;
                    }
                    i2 = i3;
                }
                if (i7 >= charSequence.length()) {
                    break;
                }
                i3 = i7;
            }
            charSequence2 = charSequence.subSequence(i4, i5 + i4);
        }
        return an10.b(((TextPaint) this.h.getValue()).measureText(charSequence2, 0, charSequence2.length()));
    }

    public final int b(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar, boolean z, int i, boolean z2) {
        int i2;
        u040 u040Var = this.d;
        u040Var.getClass();
        boolean z3 = drm0.Q(cVar.C).size() > 1;
        if (z || (z3 && !z2)) {
            return 0;
        }
        StringBuilder sb = u040Var.f;
        sb.setLength(0);
        c.C1166c c1166c = cVar.D;
        boolean z4 = !(c1166c != null && c1166c.D);
        t040 t040Var = u040Var.b;
        long j = cVar.h;
        boolean z5 = cVar.r;
        Context context = u040Var.a;
        StringBuilder sb2 = u040Var.f;
        t040Var.getClass();
        t040.a(j, z5, context, sb2, z4);
        int measureText = (int) ((TextPaint) u040Var.c.getValue()).measureText(sb, 0, sb.length());
        ConcurrentHashMap<MsgStatus, Integer> concurrentHashMap = u040Var.e;
        MsgStatus msgStatus = cVar.z ? MsgStatus.SENDING : cVar.A ? MsgStatus.ERROR : cVar.c <= i ? MsgStatus.READ : MsgStatus.UNREAD;
        Integer num = concurrentHashMap.get(msgStatus);
        if (num != null) {
            i2 = num.intValue();
        } else {
            MsgStatusViewV2 msgStatusViewV2 = (MsgStatusViewV2) u040Var.d.getValue();
            msgStatusViewV2.setStatus(msgStatus);
            msgStatusViewV2.measure(0, 0);
            int measuredWidth = msgStatusViewV2.getMeasuredWidth();
            concurrentHashMap.put(msgStatus, Integer.valueOf(measuredWidth));
            i2 = measuredWidth;
        }
        return measureText + i2;
    }

    public final int c(ArrayList arrayList, int i, ProfilesInfo profilesInfo, int i2) {
        int i3;
        int b;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0;
        int i4;
        c.C1166c c1166c;
        float b2;
        int a2;
        int b3;
        float a3;
        a.d dVar;
        Object i5;
        a.g gVar;
        a.C1165a c1165a;
        String str;
        a.c cVar;
        Integer num;
        a.b bVar;
        c.C1166c c1166c2;
        int a4;
        c.C1166c c1166c3;
        if (((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(i)).C()) {
            int i6 = u;
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(i);
            l();
            int i7 = i(gVar2.C());
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E02 = gVar2.E0();
            if (E02 != null) {
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E03 = gVar2.E0();
                boolean z = (E03 == null || (c1166c3 = E03.D) == null) ? false : c1166c3.H.c;
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E04 = gVar2.E0();
                boolean z2 = E04 != null ? E04.p : false;
                int i8 = a.$EnumSwitchMapping$0[gVar2.l().ordinal()];
                if (i8 != 1) {
                    a4 = i8 != 2 ? i8 != 3 ? i8 != 4 ? i7 : g(E02, i7, i2, arrayList, i) : j() - i6 : b(E02, z2, i2, false);
                } else {
                    a4 = a(gVar2.K()) + (z ? 0 : b(E02, z2, i2, false));
                }
                int i9 = a4 + i6;
                if (i9 < i7 && i7 - i9 > v) {
                    return i9;
                }
            }
            return i7;
        }
        l();
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar3 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(i);
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar4 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i + 1, arrayList);
        boolean F0 = gVar4 != null ? gVar4.F0() : false;
        int i10 = i(gVar3.C());
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E05 = gVar3.E0();
        if (E05 == null) {
            return i10;
        }
        c.C1166c c1166c4 = E05.D;
        if (c1166c4 != null && c1166c4.L && !c1166c4.k) {
            Context context = this.a;
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E06 = gVar3.E0();
            return Math.min(((E06 == null || (c1166c2 = E06.D) == null || !c1166c2.L) ? false : true ? e3m.a(R.dimen.vkim_unified_clip_preview_width, context) + e3m.a(R.dimen.nested_line_space, context) + e3m.a(R.dimen.nested_line_width, context) + e3m.a(R.dimen.fwd_padding, context) : i10) + u, i10);
        }
        switch (a.$EnumSwitchMapping$0[gVar3.l().ordinal()]) {
            case 1:
            case 6:
                i3 = i10;
                c.C1166c c1166c5 = E05.D;
                if (c1166c5 != null && c1166c5.w) {
                    b = (int) this.b.b(R.dimen.vkim_video_msg_size);
                    break;
                } else if (c1166c5 != null && c1166c5.z) {
                    b = f();
                    break;
                } else if (c1166c5 != null && c1166c5.x) {
                    b = f();
                    break;
                } else if (c1166c5 != null && c1166c5.y) {
                    b = f();
                    break;
                } else if (c1166c5 != null && c1166c5.A) {
                    b = h(gVar3.q() && (E0 = gVar3.E0()) != null && E0.o);
                    break;
                } else {
                    int a5 = a(gVar3.K());
                    c.C1166c c1166c6 = E05.D;
                    b = a5 + ((c1166c6 == null || !c1166c6.H.c) ? b(E05, E05.p, i2, false) : 0);
                    break;
                }
                break;
            case 2:
                i3 = i10;
                b = b(E05, E05.p, i2, false);
                break;
            case 3:
            case 28:
            case 29:
                i3 = i10;
                b = ((Number) this.t.getValue()).intValue();
                break;
            case 4:
                b = g(E05, i10, i2, arrayList, i);
                i3 = i10;
                break;
            case 5:
                qyd0 qyd0Var = this.c;
                qtd0 Bb = profilesInfo.Bb(E05.j);
                qyd0Var.getClass();
                CharSequence a6 = qyd0.a(Bb);
                c.C1166c c1166c7 = E05.D;
                if (c1166c7 == null || !c1166c7.w) {
                    int b4 = an10.b(((TextPaint) this.g.getValue()).measureText(a6, 0, a6.length()));
                    c.C1166c c1166c8 = E05.D;
                    Peer peer = c1166c8 != null ? c1166c8.a : null;
                    if (peer != null) {
                        qtd0 Bb2 = profilesInfo.Bb(peer);
                        b25 a7 = o25.a();
                        if (Bb2 != null && o25.b(a7) && Bb2.t1() && Bb2.q9().b) {
                            r6 = iah0.a(22);
                        }
                    }
                    i4 = b4 + r6;
                    b = i4;
                    i3 = i10;
                    break;
                } else {
                    b = ((Number) this.r.getValue()).intValue();
                    i3 = i10;
                }
                break;
            case 7:
                com.vk.movika.sdk.android.defaultplayer.layout.a aVar = this.b;
                y060 q0 = gVar3.q0();
                if (q0 == null) {
                    b = j();
                } else {
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E07 = gVar3.E0();
                    if (E07 == null || (c1166c = E07.D) == null) {
                        b = j();
                    } else if (c1166c.p) {
                        b2 = aVar.b(R.dimen.msg_sticker_max_width);
                        b = (int) b2;
                    } else if (c1166c.v) {
                        b = ((Number) this.r.getValue()).intValue();
                    } else if (c1166c.B || c1166c.F || c1166c.E) {
                        b = f();
                    } else {
                        float b5 = aVar.b(R.dimen.nested_line_width);
                        if (q0.b && !q0.c) {
                            b5 += aVar.b(R.dimen.reply_preview_size) + aVar.b(R.dimen.reply_preview_start_margin);
                        }
                        float b6 = aVar.b(R.dimen.reply_title_start_margin) + b5;
                        CharSequence charSequence = q0.h;
                        b = (int) (b6 + Math.max(d(q0, profilesInfo, (TextPaint) this.g.getValue()), an10.b(((TextPaint) this.h.getValue()).measureText(charSequence, 0, charSequence.length()))));
                    }
                }
                i3 = i10;
                break;
            case 8:
                StringBuilder sb = this.f;
                com.vk.movika.sdk.android.defaultplayer.layout.a aVar2 = this.b;
                y060 q02 = gVar3.q0();
                if (q02 == null) {
                    b = j();
                } else {
                    int t = gVar3.t();
                    float b7 = aVar2.b(R.dimen.nested_line_space) + aVar2.b(R.dimen.nested_line_width);
                    float b8 = aVar2.b(R.dimen.fwd_text_start_margin);
                    float b9 = (aVar2.b(R.dimen.fwd_padding) * 2) + e3m.d(R.attr.im_history_fwd_padding_start, aVar2.a);
                    sb.setLength(0);
                    bj30 bj30Var = (bj30) this.e.getValue();
                    long j = q02.f;
                    StringBuffer stringBuffer = bj30Var.e;
                    stringBuffer.setLength(0);
                    bj30Var.b(j, stringBuffer);
                    sb.append(stringBuffer);
                    b = Math.max((int) ((b7 * t) + Math.max(d(q02, profilesInfo, (TextPaint) this.j.getValue()), an10.b(k().measureText(sb, 0, sb.length()))) + b8 + b9), (q02.d ? Float.valueOf(aVar2.b(R.dimen.vkim_video_msg_size)) : Integer.valueOf(a(gVar3.K()))).intValue());
                }
                i3 = i10;
                break;
            case 9:
                if (F0) {
                    b2 = this.b.b(R.dimen.vkim_video_msg_size);
                    b = (int) b2;
                    i3 = i10;
                    break;
                } else {
                    b = e(i10, gVar3);
                    i3 = i10;
                }
            case 10:
                Context context2 = this.a;
                c.C1166c c1166c9 = E05.D;
                b = an10.b(cn70.b(16) + this.b.b(R.dimen.fwd_header_drawable_padding) + k().measureText(enj.f(R.plurals.vkim_msg_list_forward_header_num_messages, c1166c9 != null ? c1166c9.j : 0, context2)) + e3m.d(R.attr.im_history_fwd_padding_start, context2));
                i3 = i10;
                break;
            case 11:
                Context context3 = this.a;
                c.C1166c c1166c10 = E05.D;
                float measureText = k().measureText(enj.f(R.plurals.vkim_msg_list_fwd_show_all_num_messages, c1166c10 != null ? c1166c10.j : 0, context3));
                a2 = (e3m.a(R.dimen.fwd_button_show_all_padding_horizontal, context3) * 2) + u;
                b3 = an10.b(measureText);
                b = a2 + b3;
                i3 = i10;
                break;
            case 12:
                Context context4 = this.a;
                y060 q03 = gVar3.q0();
                if (q03 == null) {
                    b = j();
                } else {
                    int d = e3m.d(R.attr.im_history_fwd_padding_start_large, context4);
                    int a8 = e3m.a(R.dimen.nested_forward_content_padding, context4);
                    int a9 = e3m.a(R.dimen.nested_forward_author_name_margin_start, context4) + e3m.a(R.dimen.nested_forward_author_icon_size, context4);
                    Peer peer2 = q03.a;
                    qyd0 qyd0Var2 = this.c;
                    qtd0 Bb3 = profilesInfo.Bb(peer2);
                    qyd0Var2.getClass();
                    float f = a8 * 2;
                    float max = Math.max(k().measureText(qyd0.a(Bb3).toString()), ((TextPaint) this.m.getValue()).measureText(q03.h.toString())) + a9 + f;
                    int i11 = q03.g;
                    if (i11 < 2) {
                        a3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else {
                        int a10 = e3m.a(R.dimen.nested_forward_other_authors_icon_size, context4);
                        int i12 = i11 - 1;
                        int i13 = 3;
                        if (i12 <= 3) {
                            i13 = i12;
                        }
                        a3 = (a10 * i13) + e3m.a(R.dimen.nested_forward_show_more_text_padding_start, context4) + k().measureText(enj.f(R.plurals.vkim_msg_list_nested_forward_show_all_num_messages, i12, context4)) + f;
                    }
                    b = an10.b(Math.max(max, a3)) + d;
                }
                i3 = i10;
                break;
            case 13:
                StringBuilder sb2 = this.f;
                Context context5 = this.a;
                y060 q04 = gVar3.q0();
                if (q04 == null) {
                    b = j();
                } else {
                    int a11 = e3m.a(R.dimen.nested_line_space, context5) + e3m.a(R.dimen.nested_line_width, context5);
                    int a12 = e3m.a(R.dimen.fwd_text_start_margin, context5);
                    int d2 = e3m.d(R.attr.im_history_fwd_padding_start, context5) + (e3m.a(R.dimen.fwd_padding, context5) * 2);
                    sb2.setLength(0);
                    bj30 bj30Var2 = (bj30) this.e.getValue();
                    long j2 = q04.f;
                    StringBuffer stringBuffer2 = bj30Var2.e;
                    stringBuffer2.setLength(0);
                    bj30Var2.b(j2, stringBuffer2);
                    sb2.append(stringBuffer2);
                    b = Math.max((gVar3.t() * a11) + Math.max(d(q04, profilesInfo, (TextPaint) this.j.getValue()), an10.b(k().measureText(sb2, 0, sb2.length()))) + a12 + d2, Math.max(q04.d ? e3m.a(R.dimen.vkim_video_msg_size, context5) : a(gVar3.K()), an10.b(((TextPaint) this.p.getValue()).measureText(context5.getString(R.string.vkim_msg_list_fwd_show_all)) + ((TextPaint) this.o.getValue()).measureText("...") + e3m.a(R.dimen.fwd_btn_show_all_inner_margin, context5) + (gVar3.t() * a11) + d2)));
                }
                i3 = i10;
                break;
            case 14:
            case 15:
            case 16:
                int f0 = gVar3.f0();
                float a13 = iah0.a(88);
                b = Math.max((int) (this.b.b(R.dimen.audio_msg_icon_size) + an10.b(((((iah0.v() * 3) / 5.0f) - a13) * Math.min(f0 / 30.0f, 1.0f)) + a13)), iah0.a(168));
                i3 = i10;
                break;
            case 17:
            case 18:
                b2 = this.b.b(R.dimen.vkim_video_msg_size);
                b = (int) b2;
                i3 = i10;
                break;
            case 19:
                b2 = this.b.b(R.dimen.msg_sticker_max_width);
                b = (int) b2;
                i3 = i10;
                break;
            case 20:
                b2 = this.b.b(R.dimen.msg_sticker_max_width);
                b = (int) b2;
                i3 = i10;
                break;
            case 21:
                b2 = this.b.b(R.dimen.msg_sticker_max_width);
                b = (int) b2;
                i3 = i10;
                break;
            case 22:
                b2 = this.b.b(R.dimen.msg_group_call_attach_width);
                b = (int) b2;
                i3 = i10;
                break;
            case 23:
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a s0 = gVar3.s0();
                if (s0 == null || (dVar = s0.e) == null) {
                    b = j();
                } else {
                    if (TextUtils.isEmpty(dVar.a)) {
                        String str2 = dVar.b;
                        StringBuilder sb3 = new StringBuilder("https://");
                        sb3.append(a0a.d);
                        sb3.append("/story");
                        i5 = this.b.a.getString(brm0.B(str2, sb3.toString(), false) ? R.string.vkim_msg_story_single : R.string.vkim_msg_link_single);
                    } else {
                        ucp ucpVar = ucp.a;
                        i5 = ucp.i(dVar.a);
                    }
                    String str3 = dVar.b;
                    rwj0.a.getClass();
                    rwj0.b().setLength(0);
                    rwj0.a(str3, rwj0.b());
                    String sb4 = rwj0.b().toString();
                    int i14 = MsgPartIconTwoRowView.m;
                    b = MsgPartIconTwoRowView.a.a(this.a, i5.toString(), sb4.toString());
                }
                i3 = i10;
                break;
            case 24:
                com.vk.movika.sdk.android.defaultplayer.layout.a aVar3 = this.b;
                String string = aVar3.a.getString(R.string.vkim_msg_list_wall_reply_title_primary);
                String string2 = aVar3.a.getString(R.string.vkim_msg_list_wall_reply_title_secondary);
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a s02 = gVar3.s0();
                if (s02 == null || (gVar = s02.d) == null) {
                    b = j();
                } else {
                    String str4 = gVar.a;
                    if (!TextUtils.isEmpty(str4)) {
                        String obj = ine0.q(str4).toString();
                        ucp ucpVar2 = ucp.a;
                        string = ucp.i(obj).toString();
                        string2 = string;
                    }
                    int i15 = MsgPartIconTwoRowView.m;
                    b = MsgPartIconTwoRowView.a.a(this.a, string, string2);
                }
                i3 = i10;
                break;
            case 25:
            case 26:
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a s03 = gVar3.s0();
                if (s03 == null || (c1165a = s03.c) == null) {
                    b = j();
                } else {
                    String str5 = c1165a.c;
                    StringBuilder sb5 = new StringBuilder();
                    lar larVar = lar.a;
                    int i16 = c1165a.a;
                    Float valueOf = com.vk.im.ui.components.msg_list.a.T0.indexOfKey(i16) >= 0 ? Float.valueOf(r6.get(i16) / com.vk.im.ui.components.msg_list.a.U0.get(i16)) : null;
                    long j3 = c1165a.b;
                    larVar.getClass();
                    if (valueOf != null) {
                        lar.b((long) (valueOf.floatValue() * j3), sb5);
                        sb5.append(" / ");
                    }
                    lar.b(j3, sb5);
                    if (!TextUtils.isEmpty(str5)) {
                        sb5.append(" · ");
                        sb5.append(str5.toUpperCase(Locale.ROOT));
                    }
                    ucp ucpVar3 = ucp.a;
                    String obj2 = ucp.i(c1165a.d).toString();
                    String sb6 = sb5.toString();
                    int i17 = MsgPartIconTwoRowView.m;
                    b = MsgPartIconTwoRowView.a.a(this.a, obj2, sb6);
                }
                i3 = i10;
                break;
            case 27:
                a2 = ((Number) this.s.getValue()).intValue();
                b3 = b(E05, E05.p, i2, false);
                b = a2 + b3;
                i3 = i10;
                break;
            case 30:
                b = h(E05.o && gVar3.q());
                i3 = i10;
                break;
            case 31:
                b = h(E05.o && gVar3.q());
                i3 = i10;
                break;
            case 32:
                b = h(E05.o && gVar3.q());
                i3 = i10;
                break;
            case 33:
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a s04 = gVar3.s0();
                if (s04 == null) {
                    b = j();
                    i3 = i10;
                    break;
                } else {
                    TextPaint textPaint = (TextPaint) this.k.getValue();
                    a.f fVar = s04.f;
                    if (fVar == null || (str = fVar.a) == null) {
                        str = "";
                    }
                    i4 = cn70.b(30) + Math.max(an10.b(textPaint.measureText(str)), an10.b(((TextPaint) this.l.getValue()).measureText(this.a.getString(R.string.vkm_msg_part_question_title))));
                    b = i4;
                    i3 = i10;
                }
                break;
            case 34:
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a s05 = gVar3.s0();
                b = (s05 == null || (cVar = s05.g) == null || (num = cVar.a) == null) ? j() : num.intValue();
                i3 = i10;
                break;
            case 35:
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a s06 = gVar3.s0();
                int b10 = (s06 == null || (bVar = s06.h) == null || !bVar.a) ? (int) this.b.b(R.dimen.vkim_gift_size) : j();
                y060 q05 = gVar3.q0();
                b = b10 + ((q05 == null || !q05.e) ? cn70.b(-16) : cn70.b(16));
                i3 = i10;
                break;
            default:
                b = e(i10, gVar3);
                i3 = i10;
                break;
        }
        return Math.min(b + u, i3);
    }

    public final int d(y060 y060Var, ProfilesInfo profilesInfo, TextPaint textPaint) {
        qtd0 Bb = profilesInfo.Bb(y060Var.a);
        this.c.getClass();
        CharSequence a2 = qyd0.a(Bb);
        return an10.b(textPaint.measureText(a2, 0, a2.length()));
    }

    public final int e(int i, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E02 = gVar.E0();
        if (E02 == null) {
            return i;
        }
        c.C1166c c1166c = E02.D;
        if (!(c1166c != null ? c1166c.I : false) || (E0 = gVar.E0()) == null || !E0.B) {
            return i;
        }
        boolean q = gVar.q();
        Context context = this.a;
        int a2 = e3m.a(R.dimen.vkim_chat_redesign_share_btn_margin, context) + e3m.a(R.dimen.vkim_chat_redesign_share_btn_width, context);
        if (q) {
            a2 += e3m.a(R.dimen.vkim_chat_message_avatar_container_size, context);
        }
        return i - a2;
    }

    public final int f() {
        boolean z = iah0.w(this.a) >= iah0.a((float) 360);
        int i = u;
        com.vk.movika.sdk.android.defaultplayer.layout.a aVar = this.b;
        return ((int) (z ? aVar.b(R.dimen.vkim_audio_size) : aVar.b(R.dimen.vkim_audio_compact_size))) - i;
    }

    public final int g(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar, int i, int i2, ArrayList arrayList, int i3) {
        c.a aVar;
        boolean z;
        c.C1166c c1166c = cVar.D;
        boolean z2 = cVar.p;
        if (c1166c != null) {
            aVar = c1166c.H;
        } else {
            c.b bVar = cVar.F;
            aVar = bVar != null ? bVar.f : null;
        }
        if (aVar != null) {
            List<MsgReaction> list = aVar.a;
            zdw zdwVar = i7o0.b;
            if (zdwVar == null) {
                zdwVar = null;
            }
            j3f0 e = zdwVar.e();
            m5f0 d = e != null ? e.d() : null;
            int i4 = i - u;
            int b = b(cVar, z2, i2, true);
            if (d != null) {
                z = !(i4 - ((Number) j5g.i0(m5f0.b(i4, list))).intValue() >= b);
            } else {
                z = true;
            }
            boolean z3 = true ^ z;
            int b2 = b(cVar, z2, i2, z3);
            arrayList.set(i3, ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) arrayList.get(i3)).u(z3));
            if (d != null) {
                ArrayList b3 = m5f0.b(i4, list);
                int intValue = ((Number) j5g.i0(b3)).intValue() + b2;
                int i5 = w0f0.q;
                if (intValue + i5 <= i4) {
                    b3.set(e43.h(b3), Integer.valueOf(((Number) j5g.i0(b3)).intValue() + b2 + i5));
                } else {
                    b3.add(Integer.valueOf(w0f0.t + b2 + i5));
                }
                return ((Number) j5g.n0(b3)).intValue();
            }
        }
        return i;
    }

    public final int h(boolean z) {
        int i = u;
        Context context = this.a;
        return (z ? e3m.a(R.dimen.vkim_video_attach_small_max_width, context) : e3m.a(R.dimen.vkim_video_attach_large_max_width, context)) - i;
    }

    public final int i(boolean z) {
        if (!z) {
            return j();
        }
        int z2 = iah0.z(this.a);
        int i = w;
        return z2 > i ? i : z2;
    }

    public final int j() {
        return ((Number) this.q.getValue()).intValue();
    }

    public final TextPaint k() {
        return (TextPaint) this.n.getValue();
    }

    public final void l() {
        TextPaint textPaint = (TextPaint) this.g.getValue();
        com.vk.movika.sdk.android.defaultplayer.layout.a aVar = this.b;
        textPaint.setTextSize(aVar.b(R.dimen.user_name_text_size));
        ((TextPaint) this.j.getValue()).setTextSize(aVar.b(R.dimen.vkim_msg_part_fwd_title));
        k().setTextSize(aVar.b(R.dimen.vkim_msg_part_fwd_subtitle));
        ((TextPaint) this.h.getValue()).setTextSize(aVar.b(R.dimen.vkim_msg_part_text_body));
    }
}
