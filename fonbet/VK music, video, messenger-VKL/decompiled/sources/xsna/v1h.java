package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.builders.ListBuilder;
import xsna.if6;

/* compiled from: CommunityDetailsItemsFactory.kt */
/* loaded from: classes5.dex */
public final class v1h extends if6<ExtendedCommunityProfile> {
    public final int c;
    public final Object d;
    public final Object e;
    public final if6<ExtendedCommunityProfile>.g f;
    public final if6<ExtendedCommunityProfile>.f g;
    public final if6<ExtendedCommunityProfile>.g h;
    public final if6<ExtendedCommunityProfile>.g i;
    public final if6<ExtendedCommunityProfile>.g j;
    public final if6<ExtendedCommunityProfile>.g k;
    public final if6<ExtendedCommunityProfile>.g l;
    public final if6<ExtendedCommunityProfile>.g m;
    public final if6<ExtendedCommunityProfile>.f n;
    public final if6<ExtendedCommunityProfile>.f o;
    public final if6<ExtendedCommunityProfile>.f p;
    public final if6<ExtendedCommunityProfile>.f q;
    public final btb r;

    public v1h(Context context, vmh vmhVar, ynh ynhVar) {
        super(context);
        this.c = R.attr.vk_ui_text_accent;
        uw3 uw3Var = new uw3(11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, uw3Var);
        this.e = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.g0(17));
        this.f = new if6.g(new com.vk.movika.sdk.base.logic.interactor.f(this, 13));
        this.g = new if6.f(new v74(7, context, vmhVar));
        this.h = new if6.g(new ka(vmhVar, 29));
        int i = 8;
        this.i = new if6.g(new h1(i, context, vmhVar));
        this.j = new if6.g(new nk0(i, this, context));
        this.k = new if6.g(new m9(10, context, vmhVar));
        this.l = new if6.g(new z8f(vmhVar, 2));
        this.m = new if6.g(new io3(9));
        this.n = new if6.f(new g6(7, context, vmhVar));
        this.o = new if6.f(new z5b(context, ynhVar, this, 2));
        this.p = new if6.f(new u6(12, context, ynhVar));
        this.q = new if6.f(new d50(context, vmhVar));
        this.r = new btb();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.if6
    public final if6<ExtendedCommunityProfile>.c[] a(ExtendedCommunityProfile extendedCommunityProfile) {
        if6.c cVar;
        ListBuilder e = e43.e();
        boolean booleanValue = ((Boolean) this.d.getValue()).booleanValue();
        if6<ExtendedCommunityProfile>.g gVar = this.i;
        if6<ExtendedCommunityProfile>.g gVar2 = this.l;
        if6<ExtendedCommunityProfile>.g gVar3 = this.j;
        if6<ExtendedCommunityProfile>.g gVar4 = this.f;
        if6<ExtendedCommunityProfile>.g gVar5 = this.m;
        if (booleanValue) {
            cVar = new if6.c(gVar5, gVar4, this.h, gVar3, gVar2, gVar);
            cVar.d = 4;
        } else {
            cVar = new if6.c(gVar5, gVar4, gVar3, this.k, gVar2, gVar);
            cVar.d = 4;
        }
        e.add(cVar);
        if6.c cVar2 = new if6.c(this.n);
        float f = 2;
        cVar2.b = -iah0.a(f);
        cVar2.d = 1;
        s3q0 s3q0Var = s3q0.a;
        e.add(cVar2);
        if (((Boolean) this.e.getValue()).booleanValue()) {
            if6.c cVar3 = new if6.c(this.g);
            cVar3.b = -iah0.a(f);
            cVar3.d = 1;
            e.add(cVar3);
        }
        if6.c cVar4 = new if6.c(this.p);
        cVar4.b = -iah0.a(f);
        cVar4.d = 1;
        e.add(cVar4);
        if6.c cVar5 = new if6.c(this.o);
        cVar5.b = -iah0.a(f);
        cVar5.d = 1;
        e.add(cVar5);
        if6.c cVar6 = new if6.c(this.q);
        cVar6.d = 1;
        e.add(cVar6);
        return (if6.c[]) e.g().toArray(new if6.c[0]);
    }
}
