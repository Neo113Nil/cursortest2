package xsna;

import android.content.Context;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.live.api.base.LiveAnalyticsHandler;
import com.vk.libvideo.live.api.view.AddButtonContract$State;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.HashSet;
import java.util.Iterator;
import xsna.yqu;

/* compiled from: AddButtonPresenter.java */
/* loaded from: classes3.dex */
public final class sk0 implements lk0 {
    public final ymz b = ymz.c();
    public final HashSet c = new HashSet();
    public UserProfile d;
    public Group e;
    public final VideoFile f;
    public Context g;
    public io.reactivex.rxjava3.observers.a h;
    public LiveStatNew i;
    public dlz j;
    public fjs0 k;

    /* compiled from: AddButtonPresenter.java */
    public class a extends io.reactivex.rxjava3.observers.a<Group> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            sk0 sk0Var = sk0.this;
            sk0Var.h = null;
            sk0Var.d();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
            sk0.this.h = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            sk0.this.e = (Group) obj;
        }
    }

    /* compiled from: AddButtonPresenter.java */
    public class b extends io.reactivex.rxjava3.observers.a<UserProfile> {
        public b() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            sk0 sk0Var = sk0.this;
            sk0Var.h = null;
            sk0Var.d();
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
            sk0.this.h = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(Object obj) {
            sk0.this.d = (UserProfile) obj;
        }
    }

    public sk0(VideoFile videoFile, UserProfile userProfile, Group group) {
        this.d = userProfile;
        this.e = group;
        this.f = videoFile;
    }

    public final void Q() {
        io.reactivex.rxjava3.observers.a aVar = this.h;
        if (aVar != null) {
            aVar.dispose();
            this.h = null;
        }
        UserId userId = this.d.c;
        this.b.getClass();
        ymz.e(userId).subscribe(new b());
    }

    @Override // xsna.lk0
    public final void R1(mk0 mk0Var) {
        this.c.add(mk0Var);
        this.g = mk0Var.getViewContext();
    }

    public final void W(String str, AddButtonContract$State addButtonContract$State) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((mk0) it.next()).Q(str, addButtonContract$State);
        }
    }

    public final void a2(boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((mk0) it.next()).setVisible(z);
        }
    }

    public final void d() {
        Context context = this.g;
        Group group = this.e;
        if (group != null) {
            if (group.i) {
                a2(false);
                return;
            }
            if (context == null) {
                return;
            }
            a2(true);
            Group group2 = this.e;
            switch (group2.C) {
                case -1:
                case 0:
                case 3:
                    W(context.getString(group2.m == 1 ? R.string.join_group_closed : R.string.join_group), AddButtonContract$State.FOLLOW_GROUP);
                    break;
                case 1:
                    W(context.getString(R.string.group_joined), AddButtonContract$State.FOLLOWED_GROUP);
                    break;
                case 2:
                    W(context.getString(R.string.group_event_join_unsure), AddButtonContract$State.FOLLOWED_GROUP);
                    break;
                case 4:
                    W(context.getString(R.string.group_sent_req), AddButtonContract$State.FOLLOWED_GROUP);
                    break;
                case 5:
                    W(context.getString(R.string.group_invited), AddButtonContract$State.FOLLOW_GROUP);
                    break;
            }
            return;
        }
        if (this.d != null) {
            if (o25.a().a(this.d.c)) {
                a2(false);
                return;
            }
            if (context == null) {
                return;
            }
            a2(true);
            UserProfile userProfile = this.d;
            int i = userProfile.v;
            if (i == -1 || i == 0) {
                W(context.getString(userProfile.x ? R.string.profile_add_friend : R.string.profile_subscribe), AddButtonContract$State.ADD_USER);
                return;
            }
            if (i == 1) {
                W(context.getString(R.string.profile_btn_subscribed), AddButtonContract$State.ADDED_USER);
            } else if (i == 2) {
                W(context.getString(R.string.profile_btn_req_rcvd), AddButtonContract$State.ADD_USER);
            } else {
                if (i != 3) {
                    return;
                }
                W(context.getString(R.string.profile_btn_is_friend), AddButtonContract$State.ADDED_USER);
            }
        }
    }

    @Override // xsna.lk0
    public final void k2() {
        io.reactivex.rxjava3.internal.operators.observable.b0 E;
        Group group = this.e;
        int i = 0;
        VideoFile videoFile = this.f;
        ymz ymzVar = this.b;
        if (group == null) {
            UserProfile userProfile = this.d;
            if (userProfile != null) {
                int i2 = userProfile.v;
                if (i2 != -1 && i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                return;
                            }
                        }
                    }
                    LiveAnalyticsHandler.AuthorType authorType = LiveAnalyticsHandler.AuthorType.GROUP;
                    dlz dlzVar = this.j;
                    if (dlzVar != null) {
                        dlzVar.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE_OUT);
                    }
                    io.reactivex.rxjava3.observers.a aVar = this.h;
                    if (aVar != null) {
                        aVar.dispose();
                        this.h = null;
                    }
                    UserProfile userProfile2 = this.d;
                    ymzVar.getClass();
                    io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new eos(userProfile2.c, 0), null, null, 3);
                    qk0 qk0Var = new qk0(this);
                    y0.subscribe(qk0Var);
                    this.h = qk0Var;
                    return;
                }
                LiveAnalyticsHandler.AuthorType authorType2 = LiveAnalyticsHandler.AuthorType.GROUP;
                dlz dlzVar2 = this.j;
                if (dlzVar2 != null) {
                    dlzVar2.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT);
                }
                io.reactivex.rxjava3.observers.a aVar2 = this.h;
                if (aVar2 != null) {
                    aVar2.dispose();
                    this.h = null;
                }
                UserProfile userProfile3 = this.d;
                ymzVar.getClass();
                io.reactivex.rxjava3.internal.operators.observable.m1 y02 = rsg0.y0(new yjs(userProfile3.c, null, 1, videoFile.o0(), videoFile.I0()), null, null, 3);
                pk0 pk0Var = new pk0(this);
                y02.subscribe(pk0Var);
                this.h = pk0Var;
                LiveStatNew liveStatNew = this.i;
                if (liveStatNew != null) {
                    liveStatNew.c(this.d.c);
                    return;
                }
                return;
            }
            return;
        }
        int i3 = group.C;
        int i4 = 5;
        if (i3 != -1 && i3 != 0) {
            if (i3 != 1) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return;
                        }
                    }
                }
            }
            LiveAnalyticsHandler.AuthorType authorType3 = LiveAnalyticsHandler.AuthorType.GROUP;
            dlz dlzVar3 = this.j;
            if (dlzVar3 != null) {
                dlzVar3.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE_OUT);
            }
            io.reactivex.rxjava3.observers.a aVar3 = this.h;
            if (aVar3 != null) {
                aVar3.dispose();
                this.h = null;
            }
            Context context = this.g;
            Group group2 = this.e;
            if (context == null || group2 == null) {
                return;
            }
            xwk.e().h0().m(context, fkq0.e(group2.c), new nk0(0, this, group2), group2);
            return;
        }
        LiveAnalyticsHandler.AuthorType authorType4 = LiveAnalyticsHandler.AuthorType.GROUP;
        dlz dlzVar4 = this.j;
        if (dlzVar4 != null) {
            dlzVar4.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT);
        }
        io.reactivex.rxjava3.observers.a aVar4 = this.h;
        if (aVar4 != null) {
            aVar4.dispose();
            this.h = null;
        }
        fjs0 fjs0Var = this.k;
        FullSourceJoinApi.EntryServiceType entryServiceType = fjs0Var != null ? fjs0Var.a : null;
        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
        String a2 = uiTrackingScreen != null ? com.vk.stat.scheme.t0.a(uiTrackingScreen.a) : "";
        Group group3 = this.e;
        ymzVar.getClass();
        ComFeatures comFeatures = ComFeatures.COM_JOIN_FULL_SOURCE;
        comFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        boolean a3 = bVar.a(comFeatures);
        FullSourceJoinApi f = a3 ? zm00.f(entryServiceType, a2, videoFile.M4()) : null;
        ComFeatures comFeatures2 = ComFeatures.COM_CODEGEN_GROUPS_JOIN;
        comFeatures2.getClass();
        boolean a4 = bVar.a(comFeatures2);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        if (a4) {
            E = rsg0.y0(yfb.y(yqu.a.b(null, null, null, null, fkq0.a(group3.c), null, null, f != null ? f.a() : null), new ehu(i4)), null, null, 3).E(new wmz(group3, i), lVar, kVar, kVar);
        } else {
            gqu gquVar = new gqu(group3.c, false, null, videoFile.o0(), videoFile.I0(), a3);
            gquVar.N0(f);
            E = rsg0.y0(gquVar, null, null, 3).E(new cp0(group3, 28), lVar, kVar, kVar);
        }
        rk0 rk0Var = new rk0(this);
        E.subscribe(rk0Var);
        this.h = rk0Var;
        LiveStatNew liveStatNew2 = this.i;
        if (liveStatNew2 != null) {
            liveStatNew2.c(this.e.c);
        }
    }

    @Override // xsna.pk6
    public final void pause() {
        io.reactivex.rxjava3.observers.a aVar = this.h;
        if (aVar != null) {
            aVar.dispose();
            this.h = null;
        }
    }

    @Override // xsna.pk6
    public final void release() {
        io.reactivex.rxjava3.observers.a aVar = this.h;
        if (aVar != null) {
            aVar.dispose();
            this.h = null;
        }
    }

    @Override // xsna.pk6
    public final void resume() {
        if (this.e != null) {
            t();
        } else if (this.d != null) {
            Q();
        }
    }

    @Override // xsna.pk6
    public final void start() {
        d();
    }

    public final void t() {
        io.reactivex.rxjava3.observers.a aVar = this.h;
        if (aVar != null) {
            aVar.dispose();
            this.h = null;
        }
        UserId userId = this.e.c;
        this.b.getClass();
        io.reactivex.rxjava3.internal.operators.observable.m1 d = ymz.d(userId);
        a aVar2 = new a();
        d.subscribe(aVar2);
        this.h = aVar2;
    }
}
