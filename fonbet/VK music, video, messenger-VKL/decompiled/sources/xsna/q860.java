package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.posting.api.model.PostingMediaEntryPoint;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.vhc0;
import xsna.zwc0;

/* compiled from: NewPostingFragmentBuilder.kt */
/* loaded from: classes4.dex */
public final class q860 implements kk6, w8i {
    public final Object b;
    public final Object c;
    public final Object d;
    public final r84 e;
    public epc0 f;
    public PostingCreationEntryPoint g;
    public Post h;
    public Long i;
    public zwc0 j;
    public boolean k;
    public PostingMediaEntryPoint l;
    public Integer m;
    public boolean n;
    public boolean o;
    public boolean p;
    public String q;

    /* compiled from: NewPostingFragmentBuilder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[epc0.values().length];
            try {
                iArr[epc0.NewPost.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[epc0.EditPost.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[epc0.EditLocalDraft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[epc0.EditRemoteDraft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public q860() {
        by20 by20Var = new by20(this, 10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, by20Var);
        this.c = msy.a(lazyThreadSafetyMode, new b410(this, 6));
        this.d = msy.a(lazyThreadSafetyMode, new pp00(this, 13));
        this.e = new r84(new ln20(this, 5));
        this.f = epc0.NewPost;
        this.g = PostingCreationEntryPoint.Other;
        this.j = new zwc0(0);
        this.k = true;
        this.l = PostingMediaEntryPoint.Default;
        this.p = true;
    }

    @Override // xsna.kk6
    public final kk6 a(UserId userId, String str, boolean z) {
        this.k = !z;
        this.j = zwc0.a(this.j, new zwc0.a.b(userId, str), null, null, null, null, false, 62);
        return this;
    }

    @Override // xsna.kk6
    public final kk6 b(PostingVisibilityMode postingVisibilityMode) {
        this.j = zwc0.a(this.j, null, null, null, null, postingVisibilityMode, false, 47);
        return this;
    }

    @Override // xsna.kk6
    public final void d(u90 u90Var, int i) {
        p(i, ((bc6) u90Var).a);
    }

    @Override // xsna.kk6
    public final kk6 e(String str) {
        this.q = str;
        return this;
    }

    @Override // xsna.kk6
    public final kk6 f() {
        this.l = PostingMediaEntryPoint.Video;
        return this;
    }

    @Override // xsna.kk6
    public final kk6 g(UserId userId, ExtendedUserProfile extendedUserProfile) {
        zwc0 zwc0Var = this.j;
        UserProfile userProfile = extendedUserProfile.a;
        this.j = zwc0.a(zwc0Var, new zwc0.a.C4207a(userProfile != null ? userProfile.c : null, userProfile.e, false), null, null, null, null, !extendedUserProfile.g0, 30);
        this.k = extendedUserProfile.Y == 2 || !extendedUserProfile.f0 || extendedUserProfile.a0 >= 2 || extendedUserProfile.g0 || extendedUserProfile.h0;
        return this;
    }

    @Override // xsna.kk6
    public final kk6 h(long j) {
        this.f = epc0.EditLocalDraft;
        this.i = Long.valueOf(j);
        return this;
    }

    @Override // xsna.kk6
    public final kk6 i(PostingCreationEntryPoint postingCreationEntryPoint) {
        this.g = postingCreationEntryPoint;
        return this;
    }

    @Override // xsna.kk6
    public final kk6 j() {
        this.p = false;
        return this;
    }

    @Override // xsna.kk6
    public final kk6 k() {
        this.l = PostingMediaEntryPoint.Photo;
        return this;
    }

    @Override // xsna.kk6
    public final void l(Context context) {
        p(-1, context);
    }

    public final kk6 m(long j, String str, boolean z) {
        this.j = zwc0.a(this.j, null, str, null, Long.valueOf(j), null, false, 53);
        if (z) {
            this.l = PostingMediaEntryPoint.Photo;
        }
        return this;
    }

    public final kk6 n(UserId userId, String str, List list, Group group) {
        zwc0.a c4207a = group != null ? new zwc0.a.C4207a(group.c, 6) : new zwc0.a.b(userId, null);
        this.j = zwc0.a(this.j, c4207a, str, this.e.a(list != null ? j5g.O0(list) : null), null, null, false, 56);
        return this;
    }

    public final kk6 o(Post post, Group group) {
        this.f = epc0.EditPost;
        this.h = post;
        if (!qr.f(post.o.b)) {
            this.j = zwc0.a(this.j, new zwc0.a.C4207a(group.c, 2), null, null, null, null, true, 30);
        }
        this.k = !post.Pb();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i, Context context) {
        UserId c;
        vhc0 dVar;
        vhc0 vhc0Var;
        UserId c2;
        if (context == null) {
            return;
        }
        boolean e = ((evl0) this.c.getValue()).e();
        int i2 = a.$EnumSwitchMapping$0[this.f.ordinal()];
        if (i2 != 1) {
            vhc0Var = null;
            vhc0Var = null;
            vhc0Var = null;
            if (i2 == 2) {
                Post post = this.h;
                if (post != null) {
                    zwc0.a aVar = this.j.a;
                    zwc0.a.C4207a c4207a = aVar instanceof zwc0.a.C4207a ? (zwc0.a.C4207a) aVar : null;
                    dVar = new vhc0.c(c4207a != null ? c4207a.a() : null, post, this.g, this.k, this.m, e, this.n, post.ec());
                }
                if (vhc0Var == null) {
                }
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Post post2 = this.h;
                    if (post2 != null) {
                        dVar = new vhc0.c(null, post2, this.g, this.k, null, e, false, false);
                    }
                    if (vhc0Var == null) {
                        ((hbc0) this.b.getValue()).a(context, vhc0Var, i);
                        return;
                    }
                    return;
                }
                Long l = this.i;
                if (l != null) {
                    long longValue = l.longValue();
                    zwc0.a aVar2 = this.j.a;
                    if (aVar2 instanceof zwc0.a.C4207a) {
                        c2 = ((zwc0.a.C4207a) aVar2).a();
                        if (c2 == null) {
                            c2 = o25.a().c();
                        }
                    } else {
                        c2 = aVar2 instanceof zwc0.a.b ? ((zwc0.a.b) aVar2).a : o25.a().c();
                    }
                    dVar = new vhc0.a(c2, longValue, this.g, this.k, this.j.f, e, this.m);
                }
                if (vhc0Var == null) {
                }
            }
        } else {
            zwc0.a aVar3 = this.j.a;
            if (aVar3 instanceof zwc0.a.C4207a) {
                c = ((zwc0.a.C4207a) aVar3).a();
                if (c == null) {
                    c = o25.a().c();
                }
            } else {
                c = aVar3 instanceof zwc0.a.b ? ((zwc0.a.b) aVar3).a : o25.a().c();
            }
            dVar = new vhc0.d(c, this.j, this.g, this.k, this.l, this.m, this.n, this.p, this.q, e, this.o);
        }
        vhc0Var = dVar;
        if (vhc0Var == null) {
        }
    }

    @Override // xsna.kk6
    public final kk6 c() {
        return this;
    }
}
