package xsna;

import android.view.View;
import android.view.ViewTreeObserver;
import com.vk.catalog2.common.ui.holders.LinkVh;
import java.util.List;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerAdaptersKt;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.by1;
import xsna.eda;
import xsna.ihz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class erb implements io.reactivex.rxjava3.core.s, ihz.b, eda.a, io.reactivex.rxjava3.core.a0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ erb(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.ihz.b
    public void a(Object obj, vnr vnrVar) {
        by1 by1Var = (by1) obj;
        by1Var.K((jza0) this.d, new by1.b(vnrVar, ((hal) this.c).f));
    }

    @Override // xsna.eda.a
    public io.reactivex.rxjava3.core.q b(wba wbaVar, List list, String str) {
        com.vk.catalog2.feature.music.configuration.b bVar = (com.vk.catalog2.feature.music.configuration.b) this.c;
        return ((q9a) bVar.L.getValue()).h(egi.t(((qmk0) this.d).b(wbaVar, list, str), bVar.O));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, xsna.fcz] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        switch (this.b) {
            case 1:
                ConversationFeatureManagerAdaptersKt.observeFeatureRoles$lambda$0((ConversationFeatureManager) this.c, (CallFeature) this.d, rVar);
                break;
            default:
                final View view = (View) this.c;
                final LinkVh linkVh = (LinkVh) this.d;
                final ?? r2 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.fcz
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        int i = view.getResources().getConfiguration().orientation;
                        Integer num = linkVh.u;
                        if (num != null && num.intValue() == i) {
                            return;
                        }
                        rVar.onNext(Integer.valueOf(i));
                    }
                };
                rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.gcz
                    @Override // io.reactivex.rxjava3.functions.e
                    public final void cancel() {
                        view.getViewTreeObserver().removeOnGlobalLayoutListener(r2);
                    }
                });
                view.getViewTreeObserver().addOnGlobalLayoutListener(r2);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        ((SessionRoomsManager) this.c).getRoomParticipants((SessionRoomId.Room) this.d, new q8i0(yVar, 2), new pb00(yVar, 24));
    }
}
