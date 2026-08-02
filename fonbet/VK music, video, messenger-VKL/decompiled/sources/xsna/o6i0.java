package xsna;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.gm50;
import xsna.kxi0;
import xsna.tlh0;
import xsna.wlp0;
import xsna.wqs0;
import xsna.xvo0;
import xsna.ywi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class o6i0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o6i0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        gzs<s3q0> b;
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                p6i0 p6i0Var = (p6i0) obj3;
                PhotoAlbum photoAlbum = (PhotoAlbum) obj2;
                TextView textView = p6i0Var.q;
                if (jno0.b(textView) && p6i0Var.o.a(photoAlbum)) {
                    String str = photoAlbum.g;
                    j9x it = swe0.q(0, StaticLayout.Builder.obtain(str, 0, str.length(), textView.getPaint(), textView.getMeasuredWidth()).setMaxLines(2).setIncludePad(false).setEllipsize(TextUtils.TruncateAt.END).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).build().getLineCount()).iterator();
                    double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                    while (it.d) {
                        d += r0.getLineWidth(it.nextInt());
                    }
                    CharSequence ellipsize = TextUtils.ellipsize(photoAlbum.g, textView.getPaint(), ((float) d) - textView.getPaint().measureText("___"), TextUtils.TruncateAt.END);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(ellipsize);
                    spannableStringBuilder.append((CharSequence) " ");
                    ImageSpan imageSpan = new ImageSpan((Drawable) p6i0Var.t.getValue(), 0);
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.setSpan(imageSpan, length - 1, length, 33);
                    textView.setText(spannableStringBuilder);
                }
                break;
            case 1:
                kxi0 kxi0Var = (kxi0) obj2;
                gm50.a.a((vwi0) obj3, ((ywi0.f) obj).a, new i750(kxi0Var, 25));
                kxi0Var.a.onNext(kxi0.a.ROOM);
                break;
            case 2:
                ((Task) obj3).addOnCompleteListener((Executor) obj2, new xtj0((io.reactivex.rxjava3.core.y) obj));
                break;
            case 3:
                kho0 kho0Var = new kho0(0, (gzs) obj);
                g86 g86Var = new g86(22, (azl) obj3, (wh50) obj2);
                sgi0<gzs<ov70>> sgi0Var = oc00.a;
                break;
            case 4:
                izs izsVar = (izs) obj3;
                Object obj4 = ((xvo0.a) obj2).l;
                izsVar.invoke(((vvo0) (obj4 != null ? obj4 : null)).b);
                break;
            case 5:
                wlp0 wlp0Var = (wlp0) obj3;
                wlp0.d dVar = (wlp0.d) obj2;
                wlp0Var.i.add(dVar);
                break;
            case 6:
                wmq0.B((nnq0) obj3, (uu50) obj2, CommunityProfileContentItem.State.LOADING, null, 4);
                break;
            case 7:
                s2u0 s2u0Var = (s2u0) obj;
                ((izs) obj3).invoke(new wqs0.r(((xrs0) obj2).b, s2u0Var.a, s2u0Var.b));
                break;
            case 8:
                p5u0 p5u0Var = (p5u0) obj3;
                io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) obj2;
                List list = (List) obj;
                int e = on00.e(c5g.u(list, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj5 : list) {
                    linkedHashMap.put(Integer.valueOf(((MsgFromChannel) obj5).d), obj5);
                }
                io.reactivex.rxjava3.disposables.c cVar = p5u0Var.c;
                if (cVar != null) {
                    cVar.dispose();
                }
                io.reactivex.rxjava3.internal.operators.completable.y q = ((io.reactivex.rxjava3.core.a) p5u0Var.a.invoke(linkedHashMap.values())).g(new bpk(p5u0Var, 5)).q(asu0.a.c());
                int i2 = kwg0.a;
                io.reactivex.rxjava3.disposables.c subscribe = q.subscribe(io.reactivex.rxjava3.internal.functions.a.c, new jwg0("VisiblePostsContentUpdater"));
                bVar.b(subscribe);
                p5u0Var.c = subscribe;
                break;
            case 9:
                tlh0.b bVar2 = (tlh0.b) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                qgi0.h(tgi0Var, (String) obj3);
                if (bVar2 != null && (b = bVar2.b()) != null) {
                    String c = bVar2.c();
                    if (c == null) {
                        c = "";
                    }
                    qgi0.i(tgi0Var, Collections.singletonList(new fmk(c, new k3(3, b))));
                }
                break;
            case 10:
                ((kzv0) obj2).u.getClass();
                ((jzv0) obj3).invoke(b1s0.a((VideoVideoAlbumFullDto) obj));
                break;
            default:
                ((f7w0) obj3).l.b(((g7w0) obj2).b, false);
                break;
        }
        return s3q0.a;
    }
}
