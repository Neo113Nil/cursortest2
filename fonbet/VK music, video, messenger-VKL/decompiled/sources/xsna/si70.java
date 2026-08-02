package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.vk.channels.api.Channel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeoutException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.g1e0;
import xsna.pdg0;

/* compiled from: NotificationsAvatarsFetcher.kt */
/* loaded from: classes5.dex */
public final class si70 implements ri70 {
    public static final String f = ri70.class.getSimpleName();
    public static final int g = iah0.a(56);
    public final Context a;
    public final caw b;
    public final daw c;
    public final int d = g;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new p5y(this, 17));

    public si70(Context context, caw cawVar, daw dawVar) {
        this.a = context;
        this.b = cawVar;
        this.c = dawVar;
    }

    @Override // xsna.ri70
    public final Bitmap a(long j) {
        Object obj;
        Dialog dialog;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        tqm tqmVar = new tqm(Peer.a.b(j), Source.CACHE);
        caw cawVar = this.b;
        pdg0 n = cawVar.a.n(cawVar, tqmVar);
        if (n instanceof pdg0.a) {
            obj = null;
        } else {
            if (!(n instanceof pdg0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = ((pdg0.b) n).a;
        }
        wpp wppVar = (wpp) obj;
        if (wppVar != null) {
            dialog = (Dialog) wppVar.c.get(Long.valueOf(j));
        } else {
            dialog = null;
        }
        if (dialog == null) {
            return null;
        }
        return e(dialog);
    }

    @Override // xsna.ri70
    public final String b(Channel channel) {
        ImageList imageList = channel.c;
        int i = this.d;
        Image Bb = imageList.Bb(i, i);
        if (Bb != null) {
            return Bb.d;
        }
        return null;
    }

    @Override // xsna.ri70
    public final LinkedHashMap c(Collection collection) {
        ProfilesInfo profilesInfo;
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(longValue));
        }
        f1e0 f1e0Var = new f1e0();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Peer peer = (Peer) it2.next();
            if (peer != null) {
                f1e0Var.c(peer);
            }
        }
        daw dawVar = this.c;
        g1e0.a aVar = new g1e0.a();
        aVar.a.e(f1e0Var);
        aVar.b = Source.CACHE;
        aVar.c = false;
        aVar.d = f;
        try {
            profilesInfo = (ProfilesInfo) itg0.f(dawVar.a.C(dawVar, new d1e0(new g1e0(aVar))), 2000L);
        } catch (RuntimeException unused) {
            profilesInfo = new ProfilesInfo();
        } catch (TimeoutException unused2) {
            profilesInfo = new ProfilesInfo();
        }
        int e = on00.e(c5g.u(arrayList, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Peer peer2 = (Peer) it3.next();
            Long valueOf = Long.valueOf(peer2.b);
            qtd0 Bb = profilesInfo.Bb(peer2);
            Pair pair = new Pair(valueOf, Bb != null ? f(Bb) : null);
            linkedHashMap.put(pair.i(), pair.j());
        }
        return linkedHashMap;
    }

    @Override // xsna.ri70
    public final String d(qtd0 qtd0Var) {
        ImageList C8 = qtd0Var.C8();
        int i = this.d;
        Image Bb = C8.Bb(i, i);
        if (Bb != null) {
            return Bb.d;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Bitmap e(Dialog dialog) {
        Bitmap bitmap;
        Object obj;
        String g2 = g(dialog);
        if (g2 == null || g2.length() == 0) {
            bitmap = null;
        } else {
            io.reactivex.rxjava3.core.q l = mcr0.l(600L, g2);
            int i = kwg0.a;
            try {
                obj = l.a();
            } catch (Throwable unused) {
                obj = null;
            }
            bitmap = (Bitmap) obj;
        }
        if (bitmap != null) {
            return bitmap;
        }
        ChatSettings Hb = dialog.Hb();
        String str = Hb != null ? Hb.b : null;
        if (str == null || str.length() == 0) {
            return null;
        }
        int i2 = this.d;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        com.vk.im.ui.views.avatars.a aVar = (com.vk.im.ui.views.avatars.a) this.e.getValue();
        long longValue = dialog.Sb().longValue();
        String str2 = dialog.Hb().b;
        int i3 = com.vk.im.ui.views.avatars.a.o;
        aVar.b(longValue, str2, null);
        aVar.draw(canvas);
        s3q0 s3q0Var = s3q0.a;
        return kd7.h(this.a, createBitmap, createBitmap.getWidth() / 2.0f);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Bitmap f(qtd0 qtd0Var) {
        String d = d(qtd0Var);
        Bitmap bitmap = null;
        Object obj = null;
        bitmap = null;
        if (d != null && d.length() != 0) {
            io.reactivex.rxjava3.core.q l = mcr0.l(600L, d);
            int i = kwg0.a;
            try {
                obj = l.a();
            } catch (Throwable unused) {
            }
            bitmap = (Bitmap) obj;
        }
        if (bitmap != null) {
            return bitmap;
        }
        int i2 = this.d;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        com.vk.im.ui.views.avatars.a aVar = (com.vk.im.ui.views.avatars.a) this.e.getValue();
        aVar.d(qtd0Var);
        aVar.draw(canvas);
        s3q0 s3q0Var = s3q0.a;
        return kd7.h(this.a, createBitmap, createBitmap.getWidth() / 2.0f);
    }

    public final String g(Dialog dialog) {
        ImageList imageList;
        int i;
        Image Bb;
        ChatSettings Hb = dialog.Hb();
        if (Hb == null || (imageList = Hb.c) == null || (Bb = imageList.Bb((i = this.d), i)) == null) {
            return null;
        }
        return Bb.d;
    }
}
