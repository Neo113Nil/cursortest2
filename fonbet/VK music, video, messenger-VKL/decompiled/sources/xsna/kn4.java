package xsna;

import android.app.Activity;
import android.content.res.XmlResourceParser;
import android.util.ArraySet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.compose.foundation.gestures.Orientation;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.measurement.zzpa;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.messages.Msg;
import com.vkontakte.android.attachments.VideoAttachment;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import xsna.g730;

/* compiled from: AudioEncoderSettings.java */
/* loaded from: classes12.dex */
public final class kn4 implements SuccessContinuation, q701, cnc {
    public static final kn4 b = new kn4();
    public static final jai c = new jai(-2107533542, new jci(1), false);
    public static final jai d = new jai(766645457, new kei(), false);
    public static final jai e = new jai(173040645, new e55(0, 1), false);
    public static final kn4 f = new kn4();
    public static final /* synthetic */ kn4 g = new kn4();

    public kn4(int i) {
        switch (i) {
            case 8:
                new HashSet();
                break;
        }
    }

    public static final q90 b(Activity activity, Integer num) {
        return new q90(activity, num);
    }

    public static ebs c(Fragment fragment) {
        return new ebs(fragment, null);
    }

    public static final x8y d(Decoder decoder) {
        x8y x8yVar = decoder instanceof x8y ? (x8y) decoder : null;
        if (x8yVar != null) {
            return x8yVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + fpf0.a(decoder.getClass()));
    }

    public static final g9y e(Encoder encoder) {
        g9y g9yVar = encoder instanceof g9y ? (g9y) encoder : null;
        if (g9yVar != null) {
            return g9yVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + fpf0.a(encoder.getClass()));
    }

    public static q630 f(q630 q630Var) {
        return q630Var.g(new y9c(new g54(8)));
    }

    public static ArraySet g(gj30 gj30Var) {
        ArraySet arraySet = new ArraySet(gj30Var.k().size());
        Iterator<T> it = gj30Var.k().iterator();
        while (it.hasNext()) {
            arraySet.add(Integer.valueOf(((Msg) it.next()).b));
        }
        return arraySet;
    }

    public static cmq h(cmq cmqVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = cmqVar.a;
        }
        if ((i & 2) != 0) {
            z2 = cmqVar.b;
        }
        return (z == cmqVar.a && z2 == cmqVar.b) ? cmqVar : new cmq(z, z2);
    }

    public static bog0 i(bu9 bu9Var) {
        return (bog0) ((CardView.a) bu9Var).a;
    }

    public static final StackTraceElement j(BaseContinuationImpl baseContinuationImpl) {
        int i;
        String sb;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        b6l b6lVar = (b6l) baseContinuationImpl.getClass().getAnnotation(b6l.class);
        String str = null;
        if (b6lVar == null || b6lVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? b6lVar.l()[i] : -1;
        g730.a aVar = g730.b;
        g730.a aVar2 = g730.a;
        if (aVar == null) {
            try {
                g730.a aVar3 = new g730.a(Class.class.getDeclaredMethod("getModule", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                g730.b = aVar3;
                aVar = aVar3;
            } catch (Exception unused2) {
                g730.b = aVar2;
                aVar = aVar2;
            }
        }
        if (aVar != aVar2 && (method = aVar.a) != null && (invoke = method.invoke(baseContinuationImpl.getClass(), null)) != null && (method2 = aVar.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = aVar.c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str = (String) invoke3;
            }
        }
        if (str == null) {
            sb = b6lVar.c();
        } else {
            StringBuilder b2 = v1v.b(str, '/');
            b2.append(b6lVar.c());
            sb = b2.toString();
        }
        return new StackTraceElement(sb, b6lVar.m(), b6lVar.f(), i2);
    }

    public static final bxz k(izs izsVar) {
        xwz xwzVar = new xwz();
        izsVar.invoke(xwzVar);
        return new bxz(xwzVar.a);
    }

    public static c0c0 l(NewsEntry newsEntry) {
        UserId userId;
        VideoFile videoFile;
        int i = 0;
        if (!(newsEntry instanceof Videos)) {
            if (newsEntry instanceof Post) {
                Post post = (Post) newsEntry;
                return new c0c0(post.n, post.m, false);
            }
            if (!(newsEntry instanceof PromoPost)) {
                return null;
            }
            Post post2 = ((PromoPost) newsEntry).n;
            return new c0c0(post2.n, post2.m, false);
        }
        Videos videos = (Videos) newsEntry;
        if (!videos.Ea()) {
            return null;
        }
        Owner owner = videos.m;
        if (owner == null || (userId = owner.b) == null) {
            userId = UserId.d;
        }
        VideoAttachment Nb = videos.Nb();
        if (Nb != null && (videoFile = Nb.k) != null) {
            i = videoFile.o0();
        }
        return new c0c0(i, userId, true);
    }

    public static void m(gj30 gj30Var, gj30 gj30Var2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Msg msg = (Msg) it.next();
            if (gj30Var2.d().contains(Integer.valueOf(msg.b))) {
                gj30Var.d().add(Integer.valueOf(msg.b));
            }
        }
    }

    public static final int p(kry kryVar) {
        boolean z = kryVar.getOrientation() == Orientation.Vertical;
        List<xqy> f2 = kryVar.f();
        if (f2.isEmpty()) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < f2.size()) {
            xqy xqyVar = kryVar.f().get(i);
            int m = z ? xqyVar.m() : xqyVar.i();
            if (m == -1) {
                i++;
            } else {
                int i4 = 0;
                while (i < f2.size()) {
                    xqy xqyVar2 = kryVar.f().get(i);
                    if ((z ? xqyVar2.m() : xqyVar2.i()) != m) {
                        break;
                    }
                    i4 = Math.max(i4, (int) (z ? f2.get(i).a() & 4294967295L : f2.get(i).a() >> 32));
                    i++;
                }
                i2 += i4;
                i3++;
            }
        }
        return kryVar.e() + (i2 / i3);
    }

    @Nullable
    public static final ti01 q(XmlResourceParser xmlResourceParser, nf01 nf01Var) {
        while (xmlResourceParser.next() != 1) {
            try {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("splits")) {
                        while (xmlResourceParser.next() != 3) {
                            if (xmlResourceParser.getEventType() == 2) {
                                if (xmlResourceParser.getName().equals("module")) {
                                    String r = r(xmlResourceParser, "name");
                                    if (r != null) {
                                        while (xmlResourceParser.next() != 3) {
                                            if (xmlResourceParser.getEventType() == 2) {
                                                if (xmlResourceParser.getName().equals("language")) {
                                                    while (xmlResourceParser.next() != 3) {
                                                        if (xmlResourceParser.getEventType() == 2) {
                                                            if (xmlResourceParser.getName().equals("entry")) {
                                                                String r2 = r(xmlResourceParser, "key");
                                                                String r3 = r(xmlResourceParser, "split");
                                                                s(xmlResourceParser);
                                                                if (r2 != null && r3 != null) {
                                                                    nf01Var.a(r, r2, r3);
                                                                }
                                                            } else {
                                                                s(xmlResourceParser);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    s(xmlResourceParser);
                                                }
                                            }
                                        }
                                    } else {
                                        s(xmlResourceParser);
                                    }
                                } else {
                                    s(xmlResourceParser);
                                }
                            }
                        }
                    } else {
                        s(xmlResourceParser);
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException e2) {
                Log.e("SplitInstall", "Error while parsing splits.xml", e2);
                return null;
            }
        }
        return nf01Var.b();
    }

    @Nullable
    public static final String r(XmlPullParser xmlPullParser, String str) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final void s(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public void n(bu9 bu9Var, float f2) {
        bog0 i = i(bu9Var);
        CardView.a aVar = (CardView.a) bu9Var;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (f2 != i.e || i.f != useCompatPadding || i.g != preventCornerOverlap) {
            i.e = f2;
            i.f = useCompatPadding;
            i.g = preventCornerOverlap;
            i.b(null);
            i.invalidateSelf();
        }
        o(bu9Var);
    }

    public void o(bu9 bu9Var) {
        CardView.a aVar = (CardView.a) bu9Var;
        if (!CardView.this.getUseCompatPadding()) {
            aVar.a(0, 0, 0, 0);
            return;
        }
        float f2 = i(bu9Var).e;
        float f3 = i(bu9Var).a;
        CardView cardView = CardView.this;
        int ceil = (int) Math.ceil(cog0.a(f2, f3, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(cog0.b(f2, f3, cardView.getPreventCornerOverlap()));
        aVar.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public Task then(@Nullable Object obj) throws Exception {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzpa.zzd());
    }

    @Override // xsna.cnc
    public void a(UserId userId, Integer num, String str) {
    }
}
