package xsna;

import android.content.Context;
import xsna.mwv;

/* compiled from: ChannelProfileInfoModelFactory.kt */
/* loaded from: classes16.dex */
public final class q9b implements wxd0 {
    public final long a;
    public final boolean b;
    public final s8b c;
    public final o9b d;
    public final ddb e;
    public final mxb f;
    public final Context g;
    public final kbj0 h;
    public final bzb0 i;
    public final h9k0 j;
    public final h3g0 k;
    public final boolean l;
    public final feb m;
    public final com.vk.im.channelcreation.api.a n;
    public final mwv<mwv.a> o;
    public final q7v0 p;

    public q9b(long j, boolean z, s8b s8bVar, o9b o9bVar, ddb ddbVar, mxb mxbVar, Context context, kbj0 kbj0Var, bzb0 bzb0Var, ucb ucbVar, h3g0 h3g0Var, boolean z2, feb febVar, com.vk.im.channelcreation.api.a aVar, mwv mwvVar, q7v0 q7v0Var) {
        this.a = j;
        this.b = z;
        this.c = s8bVar;
        this.d = o9bVar;
        this.e = ddbVar;
        this.f = mxbVar;
        this.g = context;
        this.h = kbj0Var;
        this.i = bzb0Var;
        this.j = ucbVar;
        this.k = h3g0Var;
        this.l = z2;
        this.m = febVar;
        this.n = aVar;
        this.o = mwvVar;
        this.p = q7v0Var;
    }

    @Override // xsna.wxd0
    public final i9b create() {
        return new i9b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
    }
}
