package com.yandex.plus.pay.internal.feature.offers;

import com.yandex.plus.pay.internal.feature.offers.PlusPayOfferDetailsConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayUpsaleStep;
import com.yandex.plus.pay.repository.api.model.offers.UpsaleStep;
import defpackage.bmd;
import defpackage.cmd;
import defpackage.fm0;
import defpackage.gm0;
import defpackage.i3y;
import defpackage.juc;
import defpackage.lyc;
import defpackage.mdd0;
import defpackage.ocd0;
import defpackage.tcc;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class a implements bmd {
    public final com.yandex.plus.pay.graphql.offers.a a;
    public final ocd0 b;
    public final mdd0 c;
    public final i3y d = kotlin.a.a(new juc(14));
    public final i3y e = kotlin.a.a(new juc(15));
    public final i3y f = kotlin.a.a(new lyc(6, this));
    public final i3y g = kotlin.a.a(new juc(16));

    public a(com.yandex.plus.pay.graphql.offers.a aVar, ocd0 ocd0Var, mdd0 mdd0Var) {
        this.a = aVar;
        this.b = ocd0Var;
        this.c = mdd0Var;
    }

    public static gm0 b(PlusPayOfferDetailsConfiguration.AdditionalOffers additionalOffers) {
        List<PlusPayUpsaleStep> passedUpsaleSteps = additionalOffers.getPassedUpsaleSteps();
        ArrayList arrayList = new ArrayList(tcc.n(passedUpsaleSteps, 10));
        Iterator<T> it = passedUpsaleSteps.iterator();
        while (it.hasNext()) {
            arrayList.add(c((PlusPayUpsaleStep) it.next()));
        }
        List<PlusPayOfferDetailsConfiguration.AdditionalOffers.Offer> offers = additionalOffers.getOffers();
        ArrayList arrayList2 = new ArrayList(tcc.n(offers, 10));
        for (PlusPayOfferDetailsConfiguration.AdditionalOffers.Offer offer : offers) {
            arrayList2.add(new fm0(offer.getOfferName(), offer.getOffersBatchId(), offer.getPositionId(), c(offer.getUpsaleStep()), offer.isSelected()));
        }
        return new gm0(arrayList, arrayList2);
    }

    public static UpsaleStep c(PlusPayUpsaleStep plusPayUpsaleStep) {
        int i = cmd.a[plusPayUpsaleStep.ordinal()];
        if (i == 1) {
            return UpsaleStep.CHECKOUT;
        }
        if (i == 2) {
            return UpsaleStep.UPSALE;
        }
        if (i == 3) {
            return UpsaleStep.PRESALE;
        }
        w511.b();
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public final java.lang.Object a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r40v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
}
