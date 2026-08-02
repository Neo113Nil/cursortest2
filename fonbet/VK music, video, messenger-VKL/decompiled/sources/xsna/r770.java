package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vk.music.player.PlayerTrack;
import com.vk.pushes.receivers.c;
import com.vk.stickers.keyboard.StickersView;
import com.vk.video.ui.discovery.minimizable.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.e6w0;
import xsna.gm50;
import xsna.jsl0;
import xsna.kxi0;
import xsna.ywi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class r770 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r770(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener, xsna.mxe0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MusicTrack musicTrack;
        String str;
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                c.a aVar = com.vk.pushes.receivers.c.b;
                c.a.e((Context) obj3, (Intent) obj2, (Throwable) obj);
                break;
            case 1:
                break;
            case 2:
                ((com.vk.attachpicker.stat.data.b) obj3).j((hyg0) obj2, (x500) obj);
                break;
            case 3:
                com.vk.music.player.playback.c cVar = (com.vk.music.player.playback.c) obj3;
                z1b0 z1b0Var = (z1b0) obj2;
                List<xd50> list = (List) obj;
                List<xd50> list2 = list;
                if (!list2.isEmpty()) {
                    eip0 eip0Var = cVar.q;
                    LinkedHashMap linkedHashMap = cVar.m;
                    List unmodifiableList = Collections.unmodifiableList(eip0Var.a);
                    PlayerTrack playerTrack = cVar.i;
                    List<PlayerTrack> S = j5g.S(unmodifiableList, (playerTrack != null ? playerTrack.d : 0) + 1);
                    ArrayList arrayList = new ArrayList(c5g.u(S, 10));
                    for (PlayerTrack playerTrack2 : S) {
                        linkedHashMap.remove(playerTrack2.b.Fb());
                        arrayList.add(playerTrack2.f);
                    }
                    cVar.k(arrayList);
                    cVar.r = cVar.o.size();
                    int size = list.size();
                    if (!list2.isEmpty()) {
                        List<xd50> list3 = list;
                        int e = on00.e(c5g.u(list3, 10));
                        if (e < 16) {
                            e = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e);
                        for (Object obj4 : list3) {
                            linkedHashMap2.put(((xd50) obj4).a.Fb(), obj4);
                        }
                        linkedHashMap.putAll(linkedHashMap2);
                        cVar.c.e(linkedHashMap);
                        if (cVar.w.j() && cVar.w.l()) {
                            cVar.I(list);
                        }
                    }
                    PlayerTrack playerTrack3 = cVar.i;
                    if (playerTrack3 != null && (musicTrack = playerTrack3.b) != null && musicTrack.Wb()) {
                        cVar.G();
                    }
                    cVar.f(size, false);
                    if (!cVar.t) {
                        PlayerTrack playerTrack4 = cVar.i;
                        z1b0Var.invoke(playerTrack4 != null ? playerTrack4.f : null);
                    }
                }
                break;
            case 4:
                final wh50 wh50Var = (wh50) obj2;
                AccessibilityManager accessibilityManager = (AccessibilityManager) ((Context) obj3).getSystemService("accessibility");
                wh50Var.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                ?? r0 = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: xsna.mxe0
                    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                    public final void onAccessibilityStateChanged(boolean z) {
                        wh50.this.setValue(Boolean.valueOf(z));
                    }
                };
                accessibilityManager.addAccessibilityStateChangeListener(r0);
                break;
            case 5:
                PhotoAlbum photoAlbum = (PhotoAlbum) obj3;
                p6i0 p6i0Var = (p6i0) obj2;
                ImageSize Cb = photoAlbum.u.Cb(p6i0Var.p.getWidth(), true, false);
                if (Cb == null || (str = Cb.d.d) == null) {
                    str = photoAlbum.k;
                }
                p6i0Var.p.load(str);
                break;
            case 6:
                kxi0 kxi0Var = (kxi0) obj2;
                gm50.a.a((vwi0) obj3, ((ywi0.b) obj).a, new xc50(kxi0Var, 19));
                kxi0Var.a.onNext(kxi0.a.ROOM_ADMIN);
                break;
            case 7:
                ((StickersView) obj3).j((UGCChatSettingsModel) obj, (rdl0) obj2);
                break;
            case 8:
                jsl0.a aVar2 = (jsl0.a) obj3;
                gzs<s3q0> gzsVar = (gzs) obj2;
                View view = (View) obj;
                aVar2.c.setLayoutParams(new ViewGroup.LayoutParams(view.getWidth(), view.getHeight()));
                aVar2.d.setLayoutParams(new ViewGroup.LayoutParams(view.getWidth(), view.getHeight()));
                StoryAttachImageView storyAttachImageView = aVar2.c;
                if (storyAttachImageView != null) {
                    storyAttachImageView.setOnBindCompleted(gzsVar);
                }
                w64 w64Var = aVar2.f;
                if (w64Var != null) {
                    aVar2.a(w64Var);
                }
                break;
            case 9:
                ((x0o0) obj3).n.add(Integer.valueOf(((Photo) obj2).c));
                break;
            case 10:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                Boolean bool = (Boolean) obj;
                ((com.vk.video.ui.discovery.minimizable.g) obj3).C(new c.g0(ref$BooleanRef.element, bool.booleanValue()));
                ref$BooleanRef.element = bool.booleanValue();
                break;
            case 11:
                ((LinksBridgeComponent) ((k7m) m7m.c((View) obj3)).a(fpf0.a(LinksBridgeComponent.class))).p().getBrowser().i(((elu0) obj2).requireContext(), Uri.parse((String) obj), LaunchContext.A, null);
                break;
            default:
                ((f7w0) obj3).l.a.invoke(new e6w0.r(((g7w0) obj2).b));
                break;
        }
        return s3q0.a;
    }
}
