package xsna;

import android.content.Context;
import android.os.Build;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockVh;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.web.ClipBox;
import com.vk.dzenarticle.impl.ui.view.ad.MiddleAdView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.log.L;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import com.vk.story.api.domain.interactor.repost.PublishedKind;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cwb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class dda implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dda(int i, Object obj, Object obj2, String str) {
        this.b = i;
        this.c = obj;
        this.e = str;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d5, code lost:
    
        if (r7 > 0) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, xsna.izs] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.b;
        boolean z = true;
        Object obj2 = this.d;
        Object obj3 = this.e;
        ?? r7 = this.c;
        switch (i2) {
            case 0:
                ((eda) r7).a((UIBlock) obj2, (CatalogReplacementResponse) obj, (String) obj3);
                return s3q0.a;
            case 1:
                ((x2b) r7).a((MsgFromChannel) obj2, (ug30) obj, (cwb0.l0) obj3);
                return s3q0.a;
            case 2:
                kdd kddVar = (kdd) obj2;
                Throwable th = (Throwable) obj;
                L.j(th, "Story upload failed!");
                AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.CLIP_REPOST);
                aggregateEventBuilder.w(0, erm0.D0(255, "SUF: ".concat(mnh0.A(th))));
                aggregateEventBuilder.q();
                vhk0.b((File) ((Ref$ObjectRef) r7).element);
                kddVar.g.e(PublishedKind.CLIP);
                kddVar.b((String) obj3, EmptySet.b);
                return s3q0.a;
            case 3:
                qzv qzvVar = (qzv) r7;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                Set set = (Set) obj3;
                FragmentEntry fragmentEntry = (FragmentEntry) obj;
                if (au90.class.isAssignableFrom(fragmentEntry.b)) {
                    androidx.lifecycle.f b = qzvVar.c.b(fragmentEntry.d);
                    au90 au90Var = b instanceof au90 ? (au90) b : null;
                    Set set2 = set;
                    if ((set2 instanceof Collection) && set2.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it = set2.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            long longValue = ((Number) it.next()).longValue();
                            if (au90Var != null && au90Var.v8(longValue) && (i = i + 1) < 0) {
                                e43.s();
                                throw null;
                            }
                        }
                    }
                    ref$IntRef.element = i;
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 4:
                up10 up10Var = (up10) obj;
                ListBuilder e = e43.e();
                e.add(new AlbumEntry(-1, (String) obj3, e43.m(up10Var.c), false, up10Var.b, null, 40, null));
                ArrayList<AlbumEntry> arrayList = up10Var.a;
                ((rq10) obj2).getClass();
                Comparator bz10Var = Build.VERSION.SDK_INT >= 29 ? new bz10() : new az10();
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (AlbumEntry albumEntry : arrayList) {
                    arrayList2.add(AlbumEntry.a(albumEntry, j5g.D0(bz10Var, albumEntry.d), 0, 59));
                }
                e.addAll(j5g.D0(new di1(0), arrayList2));
                r7.invoke(e.g());
                return s3q0.a;
            case 5:
                int i3 = MiddleAdView.n;
                ((fe0) r7).c.clear();
                ((zu50) obj2).e(((VkText) obj3).getContext());
                return s3q0.a;
            case 6:
                MusicPageInfoBlockVh musicPageInfoBlockVh = (MusicPageInfoBlockVh) r7;
                musicPageInfoBlockVh.m = null;
                ((UIBlockMusicPage) obj2).Ub();
                musicPageInfoBlockVh.l(true, true);
                musicPageInfoBlockVh.g((Context) obj3);
                return s3q0.a;
            case 7:
                ((rtc0) ((qjd0) r7).b.Q.getValue()).c((NewsEntry) obj2).k((Context) obj3);
                return s3q0.a;
            case 8:
                sul0 sul0Var = (sul0) r7;
                StoryEntry storyEntry = (StoryEntry) obj2;
                String str = (String) obj3;
                ((Boolean) obj).getClass();
                sul0Var.c.f(Collections.singletonList(storyEntry));
                if (storyEntry.R != null) {
                    ((jfm0) sul0Var.e.getValue()).n(Collections.singletonList(storyEntry));
                }
                sul0Var.h.add(str);
                sul0Var.i.remove(str);
                sul0Var.b.e(100, Collections.singletonList(storyEntry));
                return s3q0.a;
            default:
                ClipBox clipBox = (ClipBox) obj2;
                qfx0.d.getClass();
                pkd pkdVar = (pkd) qfx0.f.getValue();
                jbs jbsVar = new jbs((FragmentImpl) obj);
                ClipBox.a aVar = clipBox.a;
                pkd.A(pkdVar, jbsVar, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "vk_app", "mini_app", (Long) r7, (String) obj3, aVar.a, clipBox.c, clipBox.b, aVar.d, aVar.e, Boolean.valueOf(aVar.f), clipBox.a.g, null, null, false, null, 245760);
                return s3q0.a;
        }
    }

    public /* synthetic */ dda(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
