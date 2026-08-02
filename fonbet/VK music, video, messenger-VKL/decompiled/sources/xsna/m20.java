package xsna;

import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.voip.call_effects.a;
import xsna.a5v;
import xsna.aqz;
import xsna.xeg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m20 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((com.vk.im.engine.internal.api_commands.messages.a) obj2).invoke(obj);
                break;
            case 1:
                ((fq0) obj2).invoke(obj);
                break;
            case 2:
                ((com.vk.im.engine.internal.api_commands.messages.a) obj2).invoke(obj);
                break;
            case 3:
                ((aq1) obj2).invoke(obj);
                break;
            case 4:
                ((com.vk.im.engine.internal.api_commands.messages.a) obj2).invoke(obj);
                break;
            case 5:
                ((j20) obj2).invoke(obj);
                break;
            case 6:
                ((wa) obj2).invoke(obj);
                break;
            case 7:
                int i2 = BonusCatalogFragment.f0;
                ((a60) obj2).invoke(obj);
                break;
            case 8:
                ((a.b) obj2).invoke(obj);
                break;
            case 9:
                ((aq1) obj2).invoke(obj);
                break;
            case 10:
                ((ie8) obj2).invoke(obj);
                break;
            case 11:
                ChatFragment.d dVar = ChatFragment.w1;
                ((sqb) obj2).invoke(obj);
                break;
            case 12:
                ((com.vk.im.engine.internal.api_commands.messages.a) obj2).invoke(obj);
                break;
            case 13:
                ((com.vk.im.engine.internal.api_commands.messages.a) obj2).invoke(obj);
                break;
            case 14:
                ((xeg.b) obj2).invoke(obj);
                break;
            case 15:
                ((com.vk.im.engine.internal.api_commands.messages.a) obj2).invoke(obj);
                break;
            case 16:
                ((com.vk.im.engine.internal.api_commands.messages.a) obj2).invoke(obj);
                break;
            case 17:
                y6k y6kVar = (y6k) obj2;
                aqz.a aVar = (aqz.a) obj;
                v230 v230Var = y6kVar.t;
                v230Var.f = aVar.a;
                v230Var.e = aVar.b;
                y6kVar.Y0().a(y6kVar.t);
                break;
            case 18:
                ((aq1) obj2).invoke(obj);
                break;
            case 19:
                ((g15) obj2).invoke(obj);
                break;
            case 20:
                ((aq1) obj2).invoke(obj);
                break;
            case 21:
                ((aq1) obj2).invoke(obj);
                break;
            case 22:
                ((k0j) obj2).invoke(obj);
                break;
            case 23:
                ((a5v.a) obj2).invoke(obj);
                break;
            case 24:
                ((qm0) obj2).invoke(obj);
                break;
            case 25:
                ((qm0) obj2).invoke(obj);
                break;
            case 26:
                ((z410) obj2).invoke(obj);
                break;
            case 27:
                ((z410) obj2).invoke(obj);
                break;
            case 28:
                ((zos) obj2).invoke(obj);
                break;
            default:
                ((bk30) obj2).invoke(obj);
                break;
        }
    }
}
