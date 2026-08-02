package xsna;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.games.di.GamesCatalogComponent;
import com.vk.nspk.di.NspkSearchBanksFeatureComponentImpl;
import com.vk.nspk.di.NspkSearchBanksFeatureInnerComponent;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.superapp.vkhealth.api.di.VkHealthComponent;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import xsna.fk80;
import xsna.fk80.a;
import xsna.ysa.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class bg6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bg6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                return ((BridgeComponent) ((k7m) m7m.f((dg6) this.c)).a(fpf0.a(BridgeComponent.class))).Le();
            case 1:
                return ((ysa) this.c).new c();
            case 2:
                return ((BridgeComponent) ((gxw) this.c).c().a(fpf0.a(BridgeComponent.class))).f5();
            case 3:
                return zr.a("Internal server error occurred while executing ", ((tgx) this.c).b, ".");
            case 4:
                return ((GamesCatalogComponent) ((LinksBridgeComponentImpl) this.c).A.getValue()).E();
            case 5:
                return ((ImBridgeComponent) ((nmg0) ((ph20) this.c).c.invoke()).a(fpf0.a(ImBridgeComponent.class))).g5();
            case 6:
                if (((Boolean) ((sg40) this.c).o.getValue()).booleanValue() && MusicFeatures.AUDIO_AUTO_DOWNLOAD.h()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                return Boolean.valueOf(p1p0.a(((r360) this.c).d().e().e()));
            case 8:
                NspkSearchBanksFeatureComponentImpl nspkSearchBanksFeatureComponentImpl = (NspkSearchBanksFeatureComponentImpl) this.c;
                Context context = nspkSearchBanksFeatureComponentImpl.a;
                nwy nwyVar = nspkSearchBanksFeatureComponentImpl.b.c;
                qcy<Object> qcyVar = NspkSearchBanksFeatureInnerComponent.d[0];
                return new w2h0(context, (rm70) nwyVar.c());
            case 9:
                fk80 fk80Var = (fk80) this.c;
                fxc0.B().B();
                fk80Var.k = true;
                bu70 bu70Var = bu70.a;
                bu70Var.b(fk80Var.new a(bu70Var.f(), fk80.b.REGULAR));
                return bu70Var;
            case 10:
                PhotosComponentImpl photosComponentImpl = (PhotosComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = PhotosComponentImpl.u;
                return new up1(photosComponentImpl.d3());
            case 11:
                aid0 aid0Var = (aid0) this.c;
                bpn0 bpn0Var = aid0Var.o;
                sqo0 sqo0Var = aid0Var.e;
                xhd0 xhd0Var = aid0Var.b;
                if (!lhs.d()) {
                    thd0 thd0Var = (thd0) bpn0Var.getValue();
                    xhd0Var.getClass();
                    return new rqo0(thd0Var, sqo0Var);
                }
                lhs.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
                try {
                    thd0 thd0Var2 = (thd0) bpn0Var.getValue();
                    xhd0Var.getClass();
                    return new rqo0(thd0Var2, sqo0Var);
                } finally {
                    lhs.b();
                }
            case 12:
                s140 s140Var = (s140) this.c;
                String c = s140Var.c();
                RoomDatabase roomDatabase = (RoomDatabase) s140Var.a;
                roomDatabase.a();
                roomDatabase.b();
                return roomDatabase.i().getWritableDatabase().compileStatement(c);
            default:
                VKApplication vKApplication = (VKApplication) this.c;
                VKApplication.a aVar = VKApplication.c;
                ((VkHealthComponent) m7m.e().a(fpf0.a(VkHealthComponent.class))).Ee().b(vKApplication);
                return s3q0.a;
        }
    }
}
