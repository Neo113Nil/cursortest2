package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.WritePermission;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.stickers.bridge.GiftData;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.n6p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class rqb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rqb(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                WritePermission.State state = (WritePermission.State) obj5;
                ChatFragment chatFragment = (ChatFragment) obj4;
                Peer peer = (Peer) obj3;
                Peer peer2 = (Peer) obj2;
                Map map = (Map) obj;
                ChatFragment.d dVar = ChatFragment.w1;
                if (!map.isEmpty() && state == WritePermission.State.DISABLED_NEED_EDU_ROLE) {
                    chatFragment.Jo(Source.NETWORK);
                }
                com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
                if (aVar == null) {
                    aVar = null;
                }
                String obj6 = drm0.p0("null").toString();
                o6p o6pVar = aVar.V;
                o6pVar.getClass();
                bpn0 bpn0Var = i0q0.a;
                LinkedHashMap linkedHashMap = o6pVar.b;
                linkedHashMap.put(peer, obj6);
                Iterator it = o6pVar.a.iterator();
                while (it.hasNext()) {
                    ((n6p.a) it.next()).g2((CharSequence) linkedHashMap.get(peer));
                }
                z6p z6pVar = chatFragment.N0;
                if (z6pVar != null) {
                    io.reactivex.rxjava3.internal.operators.observable.g0 g0Var = io.reactivex.rxjava3.internal.operators.observable.g0.b;
                    asu0 asu0Var = asu0.a;
                    io.reactivex.rxjava3.internal.operators.observable.m1 a0 = g0Var.r0(asu0Var.c()).a0(asu0Var.d());
                    pp3 pp3Var = new pp3(new i4e(z6pVar, 27), 20);
                    int i2 = kwg0.a;
                    z6pVar.I0(a0.subscribe(pp3Var, new iwg0()));
                }
                chatFragment.i0 = true;
                break;
            case 1:
                ndf0 ndf0Var = (ndf0) obj5;
                ndf0Var.l.a(ndf0Var.itemView.getContext(), (StickerStockItem) obj4, (String) obj3, ((GiftData) obj2).b);
                break;
            case 2:
                WebApiApplication webApiApplication = (WebApiApplication) obj5;
                nex0 nex0Var = (nex0) obj4;
                Integer num = (Integer) obj3;
                SuperappUiRouterBridge.f fVar = (SuperappUiRouterBridge.f) obj2;
                Fragment fragment = (Fragment) obj;
                Context mo2getContext = fragment.mo2getContext();
                if (mo2getContext != null) {
                    int i3 = VkBrowserActivity.l;
                    Intent b = VkBrowserActivity.a.b(mo2getContext, webApiApplication, nex0Var.a);
                    if (num != null) {
                        fragment.startActivityForResult(b, num.intValue());
                    } else {
                        fragment.startActivity(b);
                    }
                    fVar.onSuccess();
                    break;
                } else {
                    break;
                }
            default:
                int intValue = ((Integer) obj).intValue();
                ((Ref$IntRef) obj5).element = intValue;
                ((wdt0) obj4).g(((Ref$IntRef) obj3).element, ((Ref$IntRef) obj2).element, intValue);
                break;
        }
        return s3q0.a;
    }
}
