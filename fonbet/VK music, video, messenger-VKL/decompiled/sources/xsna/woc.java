package xsna;

import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.ArrayList;
import kotlin.collections.builders.ListBuilder;
import xsna.cpc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class woc implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ woc(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CommunityProfileContentItem.State state;
        int i;
        ArrayList arrayList;
        boolean z;
        String str;
        CommunityProfileContentItem.State state2;
        switch (this.b) {
            case 0:
                zpc zpcVar = (zpc) this.d;
                izs izsVar = (izs) this.e;
                ListBuilder listBuilder = zpcVar.b;
                wow wowVar = new wow(listBuilder);
                ((nvy) obj).e(listBuilder.size(), null, new cpc.d(wowVar), new jai(2039820996, new cpc.e(wowVar, izsVar, zpcVar, this.c), true));
                break;
            default:
                jfh jfhVar = (jfh) this.d;
                fq3 fq3Var = (fq3) this.e;
                if (this.c) {
                    state2 = CommunityProfileContentItem.State.ERROR;
                    state = null;
                    i = 1983;
                    arrayList = null;
                    z = false;
                    str = null;
                } else {
                    state = CommunityProfileContentItem.State.ERROR;
                    i = 1919;
                    arrayList = null;
                    z = false;
                    str = null;
                    state2 = null;
                }
                jfhVar.q(fq3.i(fq3Var, arrayList, z, str, state2, state, i));
                break;
        }
        return s3q0.a;
    }
}
