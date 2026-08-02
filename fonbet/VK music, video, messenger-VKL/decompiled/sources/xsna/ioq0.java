package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.bridges.ImageViewer;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.messages.WritePermission;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import com.vk.im.edu.common.api.model.EduRoleType;
import com.vk.im.engine.internal.api_commands.friends.FriendsAddApiCmd;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.engine.models.user.ImAddChatUserSource;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.reporters.api.analytics.click.ImShareItemClickAnalyticsItem;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vk.im.ui.components.chat_profile.interactors.UserProfileAvatarsInteractor;
import com.vk.network.kbh.state.NetworkState;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.e3m;
import xsna.g5d0;
import xsna.nwb;
import xsna.o0r0;
import xsna.uxd0;
import xsna.wjs;
import xsna.xxd0;
import xsna.y6p;
import xsna.zxd0;

/* compiled from: UserProfileDelegate.kt */
/* loaded from: classes2.dex */
public final class ioq0 extends r46 implements wjs.a {
    public final kbj0 o;
    public final b25 p;
    public final u9h0 q;
    public final r0n0 r;
    public final com.vk.im.ui.views.avatars.b s;
    public final u90 t;
    public final zzn0 u;
    public final a v;
    public final wjs w;
    public final UserProfileAvatarsInteractor x;

    /* compiled from: UserProfileDelegate.kt */
    public interface a {
        boolean d();

        boolean e();
    }

    /* compiled from: UserProfileDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SocialButtonType.values().length];
            try {
                iArr[SocialButtonType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocialButtonType.FOLLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EduRoleType.values().length];
            try {
                iArr2[EduRoleType.ADMIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EduRoleType.EMPLOYEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EduRoleType.TEACHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EduRoleType.PARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EduRoleType.STUDENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioq0(Context context, DialogExt dialogExt, a1w a1wVar, mxv mxvVar, sj90 sj90Var, g3a0 g3a0Var, ImageViewer imageViewer, kbj0 kbj0Var, b25 b25Var, u9h0 u9h0Var, r0n0 r0n0Var, com.vk.im.ui.views.avatars.b bVar, u90 u90Var, e8v e8vVar, a aVar, rul rulVar) {
        super(context, dialogExt, a1wVar, sj90Var, g3a0Var, mxvVar, imageViewer, e8vVar, rulVar);
        zzn0 zzn0Var = new zzn0();
        this.o = kbj0Var;
        this.p = b25Var;
        this.q = u9h0Var;
        this.r = r0n0Var;
        this.s = bVar;
        this.t = u90Var;
        this.u = zzn0Var;
        this.v = aVar;
        wjs wjsVar = new wjs(a1wVar, this);
        e(wjsVar.c);
        this.w = wjsVar;
        this.x = new UserProfileAvatarsInteractor(context, imageViewer);
    }

    public static String O(qtd0 qtd0Var) {
        if (BuildInfo.t()) {
            return qtd0Var.Ra();
        }
        return "@" + qtd0Var.Ra();
    }

    @Override // xsna.r46
    public final void A() {
        a1w a1wVar = this.d;
        Peer q = a1wVar.q();
        q.getClass();
        if (!q.Ab(Peer.Type.GROUP)) {
            super.A();
            return;
        }
        qtd0 g = g();
        if (g != null) {
            final long id = g.id();
            final UserId d = fto0.d(a1wVar.q());
            qpu qpuVar = new qpu();
            L(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.e0(rsg0.y0(yfb.x(new zqu().s(d, qpuVar.a, new UserId(id))), null, null, 3).K(), new jo3(new amp(7), 21)), new qs6(new qqe(qpuVar, 25), 21)), new io.reactivex.rxjava3.functions.f() { // from class: xsna.hoq0
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    Object obj2;
                    Iterator it = ((List) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it.next();
                            if (((UserProfile) obj2).c.b == id) {
                                break;
                            }
                        }
                    }
                    UserProfile userProfile = (UserProfile) obj2;
                    ioq0 ioq0Var = ioq0.this;
                    if (userProfile != null) {
                        ioq0Var.g.k().r(ioq0Var.t, d, userProfile);
                    } else {
                        ioq0Var.j.i(new vlc0(ioq0Var, 21));
                    }
                }
            }, new w250(new r6i0(this, 11), 24));
        }
    }

    @Override // xsna.r46
    public final void E(qxb qxbVar) {
        if (!(qxbVar instanceof ChatProfileListItem.e)) {
            if (!(qxbVar instanceof ChatProfileListItem.l)) {
                if (qxbVar instanceof ChatProfileListItem.o) {
                    C();
                    return;
                }
                return;
            }
            this.p.getClass();
            FragmentManager supportFragmentManager = ((AppCompatActivity) e3m.h(this.b)).getSupportFragmentManager();
            g5d0.a aVar = new g5d0.a(this.b, null);
            Serializer.c<Peer> cVar = Peer.CREATOR;
            aVar.e = Peer.Unknown.e;
            aVar.e = this.c.f;
            aVar.H0(supportFragmentManager, "PreviewProfileModalDialog");
            return;
        }
        qtd0 Bb = this.c.b.Bb(this.c.f);
        User user = Bb instanceof User ? (User) Bb : null;
        if (user == null) {
            return;
        }
        int i = user.z;
        if (i != 0) {
            if (i == 1) {
                String Q2 = user.Q2(UserNameCase.GEN);
                int i2 = b.$EnumSwitchMapping$0[user.R.ordinal()];
                if (i2 == 1) {
                    k(new uxd0.l(Q2, new g4(25, this, user)));
                    return;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    k(new uxd0.m(Q2, new h4(18, this, user)));
                    return;
                }
            }
            if (i != 2) {
                return;
            }
        }
        this.w.a(user, FriendsAddApiCmd.Source.NONE, FriendsAddApiCmd.BlockType.NONE);
    }

    @Override // xsna.r46
    public final void F(qxb qxbVar) {
        qtd0 Bb;
        if (!(qxbVar instanceof ChatProfileListItem.k) || (Bb = this.c.b.Bb(this.c.f)) == null) {
            return;
        }
        String c5 = Bb.c5();
        if (this.e.a(c5)) {
            fvr.l(this.b, this.f.a(c5).toString());
            edw edwVar = edw.a;
            edw.i(R.string.text_copied, this.b);
        }
    }

    @Override // xsna.r46
    public final void G(xub xubVar) {
        if (xubVar instanceof avb) {
            this.g.b().O(this.t, "dialog_actions", this.c.f, ImAddChatUserSource.SCREEN);
            return;
        }
        if (!(xubVar instanceof xvb)) {
            if (xubVar instanceof iwb) {
                o0w.x(this.g.b(), this.b, null, this.c.e, this.c, null, null, false, null, null, null, null, null, null, "contact", null, null, null, false, null, null, null, null, null, 1073733618);
                return;
            } else {
                if (xubVar instanceof dwb) {
                    R(false);
                    return;
                }
                return;
            }
        }
        if (d6q0.t == NetworkState.UNSTABLE) {
            cvk.t();
            return;
        }
        xvb xvbVar = (xvb) xubVar;
        final String str = xvbVar.e;
        final String str2 = xvbVar.f;
        final boolean z = xvbVar.g;
        J(new gzs() { // from class: xsna.goq0
            @Override // xsna.gzs
            public final Object invoke() {
                ioq0 ioq0Var = ioq0.this;
                ioq0Var.g.d().m(ioq0Var.b, com.vk.dto.common.a.b(ioq0Var.c.f), new o0r0.a(false, null, null, null, null, str, str2, z, false, false, false, null, null, null, 65311));
                return s3q0.a;
            }
        });
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.r46
    public final void H(zxd0 zxd0Var) {
        if (!(zxd0Var instanceof zxd0.s.a)) {
            if (zxd0Var instanceof zxd0.s.b) {
                R(true);
                return;
            }
            return;
        }
        qtd0 Bb = this.c.b.Bb(this.c.f);
        if (Bb != null) {
            if (drm0.N(Bb.Ra())) {
                Bb = null;
            }
            if (Bb != null) {
                fvr.l(this.b, O(Bb));
                edw edwVar = edw.a;
                edw.i(R.string.text_copied, this.b);
            }
        }
    }

    @Override // xsna.wjs.a
    public final void M() {
        k(uxd0.c.a);
    }

    public final boolean Q(Dialog dialog, qtd0 qtd0Var) {
        return (o25.b(this.p) || dialog.Zb().equals(com.vk.dto.common.a.a) || qtd0Var.ka() || qtd0Var.C6() || qtd0Var.H7() || dialog.Jc()) ? false : true;
    }

    public final void R(boolean z) {
        String h = h();
        if (drm0.N(h)) {
            h = null;
        }
        String str = h;
        if (str != null) {
            a1w a1wVar = this.d;
            kbj0.c(this.o, this.b, str, false, a1wVar.q(), "user_profile", false, 96);
            a1wVar.r().O.x().a(new ImShareItemClickAnalyticsItem.ChatLinkFromProfile(z ? ImShareItemClickAnalyticsItem.ChatLinkFromProfile.Source.BUTTON_SHARE_IN_USER_ID : ImShareItemClickAnalyticsItem.ChatLinkFromProfile.Source.BUTTON_SHARE_IN_MORE_LIST));
        }
    }

    @Override // xsna.jxb
    public final xxd0 c(DialogExt dialogExt, ImStoryState imStoryState, y6p y6pVar, List<EduAchievement> list, Map<Peer, p6p> map) {
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilder2;
        int i;
        int i2;
        int i3;
        qtd0 Bb;
        qtd0 Bb2;
        qtd0 Bb3 = dialogExt.b.Bb(this.c.f);
        if (Bb3 == null) {
            return xxd0.c.a;
        }
        ProfilesSimpleInfo Ob = dialogExt.b.Ob();
        Dialog Cb = dialogExt.Cb();
        yxd0 yxd0Var = new yxd0(this.b, dialogExt, this.d, this.e, this.f);
        yxd0Var.f = this.q.a(Cb, Ob);
        if (!BuildInfo.t() && (Bb2 = this.c.b.Bb(this.c.f)) != null) {
            if (drm0.N(Bb2.Ra())) {
                Bb2 = null;
            }
            if (Bb2 != null) {
                yxd0Var.g = O(Bb2);
            }
        }
        String string = Bb3.C6() ? this.b.getString(R.string.vkim_chat_profile_user_is_blacklisted) : this.r.a(Cb, Ob);
        yxd0Var.h = string;
        p6p p6pVar = map.get(this.c.f);
        Context context = this.b;
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("  ");
        if (o25.b(this.p)) {
            e3m.a aVar = e3m.a;
            Drawable a2 = m33.a(R.drawable.vk_icon_error_circle_16, context);
            if (a2 == null) {
                spannableStringBuilder = new SpannableStringBuilder(string);
            } else {
                a2.setBounds(0, 0, cn70.b(16), cn70.b(16));
                if (p6pVar == null || EduRoleType.UNKNOWN == null) {
                    a2.setTint(dhr0.t.c(R.attr.vk_ui_text_negative));
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(e3m.f(R.attr.vk_ui_text_negative, context));
                    int length = spannableStringBuilder3.length();
                    spannableStringBuilder3.append((CharSequence) context.getString(R.string.vkim_chat_profile_no_edu_roles));
                    spannableStringBuilder3.setSpan(foregroundColorSpan, length, spannableStringBuilder3.length(), 17);
                    spannableStringBuilder = spannableStringBuilder3;
                } else {
                    a2.setTint(dhr0.t.c(R.attr.vk_ui_icon_medium));
                    spannableStringBuilder = spannableStringBuilder3.append((CharSequence) null);
                }
                if (string.length() > 0) {
                    spannableStringBuilder3.append((CharSequence) " · ").append((CharSequence) new Regex(" ").g(string, " "));
                }
                spannableStringBuilder3.setSpan(new ImageSpan(a2, 2), 0, 1, 33);
            }
            spannableStringBuilder2 = spannableStringBuilder;
        } else {
            spannableStringBuilder2 = spannableStringBuilder3.append((CharSequence) string);
        }
        yxd0Var.i = spannableStringBuilder2;
        yxd0Var.j = Bb3.q9();
        ImageList C8 = Bb3.C8();
        yxd0Var.k = C8;
        yxd0Var.o = C8.Jb() && !xjw.a(C8) && !Bb3.ka() && Bb3.W1();
        com.vk.im.ui.views.avatars.b bVar = this.s;
        bVar.getClass();
        yxd0Var.l = bVar.e(Bb3.name(), Bb3.t8());
        yxd0Var.m = f();
        yxd0Var.p = false;
        yxd0Var.q = BuildInfo.t();
        yxd0Var.r = imStoryState;
        if (y6pVar instanceof y6p.b) {
            ((y6p.b) y6pVar).getClass();
        }
        Context context2 = this.b;
        if (this.v.d() && !bu00.l(Bb3)) {
            yxd0Var.a(new iwb(context2));
        } else if (!BuildInfo.t()) {
            yxd0Var.a(new xvb(context2, Bb3.B3(), Bb3.C8().Db(), Bb3.n9()));
        }
        yxd0Var.b();
        yxd0Var.j();
        yxd0Var.s();
        Context context3 = this.b;
        Peer q = this.d.q();
        q.getClass();
        Peer.Type type = Peer.Type.GROUP;
        boolean Ab = q.Ab(type);
        if (!Ab) {
            yxd0Var.l();
        }
        yxd0Var.p();
        if (!Ab) {
            yxd0Var.r(true);
        }
        if (Bb3.r5() && !bu00.l(Bb3) && !Ab) {
            yxd0Var.k(new avb(R.drawable.vk_icon_message_add_badge_outline_28, 12, context3.getText(R.string.vkim_chat_profile_action_add_to_chat_full), null));
        }
        if (!Ab) {
            yxd0Var.k(new ewb(R.drawable.vk_icon_messages_outline_28, 12, context3.getText(R.string.vkim_chat_profile_action_shared_chats), null));
        }
        if (BuildInfo.t()) {
            yxd0Var.o();
        }
        if (!BuildInfo.t()) {
            yxd0Var.k(new dwb(R.drawable.vk_icon_share_outline_28, 12, context3.getText(R.string.vkim_chat_profile_action_share_contact), null));
        }
        if (Bb3.C6() || Cb.oc().a == WritePermission.State.DISABLED_RECIPIENT_BLACKLISTED) {
            yxd0Var.k(new awb(context3));
        } else {
            yxd0Var.k(new yub(context3));
        }
        yxd0Var.m();
        yxd0Var.f();
        Peer q2 = this.d.q();
        q2.getClass();
        boolean Ab2 = q2.Ab(type);
        if (Bb3 instanceof User) {
            if (o25.b(this.p)) {
                cau0 cau0Var = this.d.r().h;
                if (map.get(com.vk.dto.common.a.a(this.p.c())) != null) {
                    ArrayList arrayList = new ArrayList();
                    map.get(this.c.f);
                    EmptyList emptyList = EmptyList.b;
                    emptyList.getClass();
                    List H0 = j5g.H0(emptyList, 2);
                    new ArrayList(c5g.u(H0, 10));
                    Iterator it = H0.iterator();
                    if (it.hasNext()) {
                        throw null;
                    }
                    arrayList.isEmpty();
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            e43.t();
                            throw null;
                        }
                        nwb.e eVar = (nwb.e) next;
                        boolean z = j5g.b0(i4 + (-1), arrayList) != null;
                        boolean z2 = j5g.b0(i5, arrayList) != null;
                        if (eVar instanceof nwb.f) {
                            nwb.f fVar = (nwb.f) eVar;
                            eVar = new nwb.f(fVar.b, fVar.c, fVar.d, !z, !z2);
                        }
                        arrayList2.add(eVar);
                        i4 = i5;
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        yxd0Var.e((nwb.e) it3.next());
                    }
                }
                if (!list.isEmpty()) {
                    yxd0Var.e(new nwb.a(new ChatProfileListItem.a(list)));
                }
            }
            User user = (User) Bb3;
            if (!o25.b(this.p) && !user.y && !user.ka() && this.v.e() && user.O) {
                CharSequence text = this.b.getText(R.string.vkim_chat_profile_action_preview_profile);
                if (BuildInfo.t() && (Bb = this.c.b.Bb(this.c.f)) != null) {
                    if (drm0.N(Bb.Ra())) {
                        Bb = null;
                    }
                    if (Bb != null) {
                        text = O(Bb);
                    }
                }
                yxd0Var.d(new ChatProfileListItem.l(11, text.toString(), BuildInfo.t() ? R.drawable.vk_icon_mention_outline_28 : R.drawable.vk_icon_new_logo_vk_outline_28, Integer.valueOf(R.drawable.vk_icon_new_logo_vk_outline_28), false, false, true, 48));
            }
            if (!Ab2 && !BuildInfo.t() && !BuildInfo.r()) {
                User user2 = bu00.l(user) ? null : user;
                if (user2 != null && ((i = user2.z) == 0 || i == 2 || i == 1)) {
                    Context context4 = this.b;
                    int i6 = user.z;
                    SocialButtonType socialButtonType = user.R;
                    Boolean bool = this.p.o().k;
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    int i7 = 1;
                    if (i6 != 1) {
                        i2 = R.string.vkim_msg_list_empty_friends_status_add;
                        if (i6 != 2) {
                            if (i6 != 3) {
                                int i8 = ChatProfileListItem.e.a.$EnumSwitchMapping$0[socialButtonType.ordinal()];
                                if (i8 != 1) {
                                    if (i8 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i2 = R.string.vkim_msg_list_empty_friends_status_follow;
                                }
                            } else {
                                i2 = R.string.vkim_chat_profile_friends_status_friends;
                            }
                        } else if (!booleanValue) {
                            i2 = R.string.vkim_msg_list_empty_friends_status_accept;
                        }
                        i7 = 1;
                    } else {
                        int i9 = ChatProfileListItem.e.a.$EnumSwitchMapping$0[socialButtonType.ordinal()];
                        i7 = 1;
                        if (i9 == 1) {
                            i2 = R.string.vkim_msg_list_empty_friends_status_sent;
                        } else {
                            if (i9 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i2 = R.string.vkim_msg_list_empty_friends_status_following;
                        }
                    }
                    String string2 = context4.getString(i2);
                    int i10 = R.drawable.vk_icon_user_added_outline_28;
                    if (i6 != i7) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (socialButtonType == SocialButtonType.FOLLOW) {
                                    i10 = R.drawable.vk_icon_add_square_outline_28;
                                }
                            }
                        }
                        i3 = R.drawable.vk_icon_user_add_outline_28;
                        yxd0Var.d(new ChatProfileListItem.e(1, string2, i3, null, false, false, true, 56));
                    } else if (socialButtonType == SocialButtonType.FOLLOW) {
                        i10 = R.drawable.vk_icon_done_outline_28;
                    }
                    i3 = i10;
                    yxd0Var.d(new ChatProfileListItem.e(1, string2, i3, null, false, false, true, 56));
                }
            }
        }
        if (!Ab2) {
            Context context5 = this.b;
            if (!BuildInfo.t()) {
                yxd0Var.c();
                yxd0Var.i();
                if (Q(Cb, Bb3)) {
                    yxd0Var.d(new ChatProfileListItem.o(context5, BuildInfo.t()));
                }
            } else if (Q(Cb, Bb3)) {
                yxd0Var.c();
                yxd0Var.d(new ChatProfileListItem.o(context5, BuildInfo.t()));
            }
        }
        if (Cb.qc()) {
            Peer q3 = this.d.q();
            q3.getClass();
            boolean Ab3 = q3.Ab(Peer.Type.GROUP);
            List<sxb> i11 = i();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : i11) {
                if (!(((sxb) obj).a instanceof yd3) || !Ab3) {
                    arrayList3.add(obj);
                }
            }
            yxd0Var.h(arrayList3, this.u, !BuildInfo.t());
        }
        return yxd0Var.t();
    }

    @Override // xsna.wjs.a
    public final void d0(qtd0 qtd0Var) {
        k(uxd0.c.a);
    }

    @Override // xsna.wjs.a
    public final void l0(Throwable th) {
        k(uxd0.c.a);
        k(new uxd0.w(th));
    }

    @Override // xsna.r46
    public final void m() {
        a1w a1wVar = this.d;
        Peer q = a1wVar.q();
        q.getClass();
        if (!q.Ab(Peer.Type.GROUP)) {
            super.m();
            return;
        }
        qtd0 g = g();
        if (g == null) {
            return;
        }
        UserId d = fto0.d(a1wVar.q());
        b7u0 k = this.g.k();
        UserProfile userProfile = new UserProfile();
        userProfile.c = new UserId(g.id());
        userProfile.e = g.name();
        userProfile.h = g.C8().Db();
        userProfile.s.putBoolean("show_group_status", false);
        k.r(this.t, d, userProfile);
    }

    @Override // xsna.r46, xsna.jxb
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 225 && i2 == -1 && intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("new_banned", false);
            UserId userId = (UserId) intent.getParcelableExtra("user_id");
            if (userId == null) {
                return;
            }
            L(this.d.C(this, new zo(com.vk.dto.common.a.a(userId), true)), new crp0(1), io.reactivex.rxjava3.internal.functions.a.f);
            this.j.i(new ln9(booleanExtra, this));
        }
    }

    @Override // xsna.wjs.a
    public final void u(Throwable th) {
        k(uxd0.c.a);
        k(new uxd0.w(th));
    }

    @Override // xsna.wjs.a
    public final void v(qtd0 qtd0Var) {
        boolean z = qtd0Var instanceof User;
        User user = z ? (User) qtd0Var : null;
        boolean z2 = false;
        if (user != null && user.z == 2) {
            z2 = true;
        }
        if (z && ((User) qtd0Var).R == SocialButtonType.FOLLOW) {
            k(new uxd0.o0(new uho0(this, 3)));
        } else {
            k(new uxd0.f(z2, new avj0(this, 12)));
        }
    }

    @Override // xsna.r46
    public final void x(View view) {
        k(new uxd0.a(new sf4(26, this, view)));
    }

    @Override // xsna.r46
    public final void y(View view) {
        ImStoryState imStoryState;
        qtd0 Bb = this.c.b.Bb(this.c.f);
        if (Bb == null) {
            return;
        }
        xxd0 c = this.j.c();
        xxd0.b bVar = c instanceof xxd0.b ? (xxd0.b) c : null;
        if (bVar == null || (imStoryState = bVar.r) == null) {
            return;
        }
        this.g.g().a(view, Bb, imStoryState == ImStoryState.NEW, MobileOfficialAppsConStoriesStat$ViewEntryPoint.IM_CHAT_DETAILS, MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT_SETTINGS, new l9(14));
    }

    @Override // xsna.wjs.a
    public final void z(qtd0 qtd0Var) {
        if (o25.b(this.p)) {
            return;
        }
        if ((qtd0Var instanceof User) && ((User) qtd0Var).R == SocialButtonType.FOLLOW) {
            k(new uxd0.p0(new hk70(this, 29)));
        } else {
            k(new uxd0.g0(new cck0(this, 11)));
        }
    }
}
