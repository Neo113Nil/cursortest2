package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.channels.api.ChannelFilter;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.narratives.impl.highlights.HighlightChooseCoverFragment;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.newsfeed.posting.geo_picker.presentation.model.PickerPlaceDto;
import com.vk.newsfeed.posting.geo_picker.presentation.model.PlacesPage;
import com.vk.webapp.fragments.VkPayFragment;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bkd0;
import xsna.d4e;
import xsna.ij20;
import xsna.oxc0;
import xsna.re20;
import xsna.t5e;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ihb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ihb(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v39, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object failure;
        x7w x7wVar;
        Integer num;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ChannelFilter channelFilter = (ChannelFilter) obj4;
                bdb bdbVar = (bdb) obj3;
                jhb jhbVar = (jhb) obj2;
                uib a = ((xgl0) obj).a();
                wfb o = a.o(channelFilter);
                if (o != null && o.c && bdbVar.i.compareTo(o.b) < 0) {
                    a.l(channelFilter);
                }
                try {
                    w2w w2wVar = jhbVar.a;
                    com.vk.im.engine.models.im_item.a meta = w2wVar.I0().j().getMeta();
                    if (meta != null && meta.e) {
                        b5w b5wVar = new b5w(bdbVar.b, ImItemType.CHANNEL);
                        sew sewVar = w2wVar.I0().j().c(Collections.singletonList(b5wVar)).get(b5wVar);
                        if (sewVar != null && (x7wVar = sewVar.b) != null) {
                            x7w x7wVar2 = meta.b;
                            if (x7wVar2 == null) {
                                x7wVar2 = x7w.f;
                            }
                            if (x7wVar.compareTo(x7wVar2) <= 0) {
                                w2wVar.I0().j().f(com.vk.im.engine.models.im_item.a.a(meta, null, null, 111));
                            }
                        }
                    }
                    failure = s3q0.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                break;
            case 1:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj3;
                int i3 = ClipsFavoriteFolderContentListFragment.W;
                ((androidx.appcompat.app.d) obj4).dismiss();
                clipsFavoriteFolderContentListFragment.getClass();
                xn50.a.c(clipsFavoriteFolderContentListFragment, (com.vk.clips.favorites.impl.ui.folders.content.a) obj2);
                break;
            case 2:
                h5e h5eVar = (h5e) obj4;
                VideoFile videoFile = (VideoFile) obj3;
                Context context = (Context) obj2;
                e4e e4eVar = h5eVar.c;
                e4eVar.g(new d4e.a.f((u2e) obj));
                ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
                if (clipVideoFile != null && (num = clipVideoFile.x1) != null) {
                    i2 = num.intValue();
                }
                if (i2 > 0) {
                    h5eVar.k((ClipVideoFile) videoFile);
                }
                e4eVar.g(new d4e.a.c(FavoriteFolderId.Alias.AllClips.c, Collections.singletonList(videoFile.r1())));
                h5eVar.b.d(t5e.d.a, context);
                break;
            case 3:
                ygg yggVar = (ygg) obj4;
                g1x g1xVar = (g1x) obj3;
                izs izsVar = (izs) obj2;
                Throwable th2 = (Throwable) obj;
                if (yggVar != null) {
                    izsVar.invoke(yggVar.b(th2, g1xVar));
                } else {
                    par0.a.getClass();
                    par0.b("Error " + th2 + " is not handled properly because CommonApiErrorHandler is not provided");
                    izsVar.invoke(new xjq(th2));
                }
                break;
            case 4:
                kmp kmpVar = (kmp) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                Bitmap bitmap2 = (Bitmap) obj2;
                androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                ConstraintLayout constraintLayout = kmpVar.d;
                bVar.i(constraintLayout);
                float width = bitmap.getWidth() / bitmap.getHeight();
                ConstraintLayout constraintLayout2 = kmpVar.e;
                float width2 = constraintLayout2.getWidth() / constraintLayout2.getHeight();
                if (width >= 1.0f) {
                    if (width2 >= width) {
                        bVar.n(R.id.photoWrapper, constraintLayout2.getHeight());
                        bVar.p(R.id.photoWrapper, an10.b(constraintLayout2.getHeight() * width));
                    } else {
                        bVar.p(R.id.photoWrapper, constraintLayout2.getWidth());
                        bVar.n(R.id.photoWrapper, an10.b(constraintLayout2.getWidth() / width));
                    }
                } else if (width2 >= width) {
                    bVar.n(R.id.photoWrapper, constraintLayout2.getHeight());
                    bVar.p(R.id.photoWrapper, an10.b(constraintLayout2.getHeight() * width));
                } else {
                    bVar.p(R.id.photoWrapper, constraintLayout2.getWidth());
                    bVar.n(R.id.photoWrapper, an10.b(constraintLayout2.getWidth() / width));
                }
                fyt0.c(constraintLayout2, new dlb(kmpVar, bitmap, bitmap2, 4));
                bVar.b(constraintLayout);
                break;
            case 5:
                HighlightEditFragment highlightEditFragment = (HighlightEditFragment) obj4;
                UserId userId = (UserId) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                int i4 = HighlightEditFragment.h0;
                ((j6v) highlightEditFragment.g0.getValue()).d(NarrativePublishEventType.CHANGE_COVER, (String) highlightEditFragment.f0.getValue(), null);
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((z2m0) it.next()).a.c));
                }
                HighlightCover H6 = ((u4v) highlightEditFragment.S).H6();
                Bundle bundle = new Bundle();
                bundle.putParcelable("owner_id", userId);
                bundle.putIntegerArrayList("EXTRA_STORY_IDS", p4g.q(arrayList2));
                bundle.putParcelable("EXTRA_COVER", H6);
                oz50 oz50Var = new oz50(HighlightChooseCoverFragment.class, null, bundle);
                oz50Var.s(true);
                oz50Var.g(3120, highlightEditFragment);
                break;
            case 6:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                l7r0 l7r0Var = (l7r0) obj3;
                re20 re20Var = (re20) obj2;
                ref$ObjectRef.element = p4g.k((List) obj, StringUtils.COMMA, new ept(9));
                ij20.a aVar = new ij20.a();
                aVar.d = l7r0Var.a.g;
                aVar.c = "messages.getConversationsById";
                aVar.b("peer_ids", (String) ref$ObjectRef.element);
                Peer peer = re20Var.c;
                peer.getClass();
                if (peer.Ab(Peer.Type.GROUP)) {
                    aVar.f.put("group_id", Long.valueOf(peer.d).toString());
                }
                aVar.b("lang", re20Var.e);
                aVar.i = re20Var.d;
                ij20 ij20Var = new ij20(aVar);
                re20.a aVar2 = new re20.a();
                break;
            case 7:
                oxc0.a aVar3 = (oxc0.a) obj;
                aVar3.a = (String) obj4;
                aVar3.b = (String) obj3;
                ArrayList arrayList3 = aVar3.c;
                List<String> O0 = j5g.O0((Set) obj2);
                ArrayList arrayList4 = new ArrayList(c5g.u(O0, 10));
                for (String str : O0) {
                    oxc0.b.a aVar4 = new oxc0.b.a();
                    aVar4.b = str;
                    aVar4.a = str;
                    arrayList4.add(aVar4.a());
                }
                arrayList3.addAll(arrayList4);
                break;
            case 8:
                dra0 dra0Var = (dra0) obj4;
                String str2 = (String) obj3;
                Location location = (Location) obj2;
                PlacesPage placesPage = (PlacesPage) obj;
                List<PickerPlaceDto> list = placesPage.c;
                ArrayList arrayList5 = new ArrayList(c5g.u(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(new gra0((PickerPlaceDto) it2.next()));
                }
                break;
            case 9:
                List list2 = (List) obj4;
                wow wowVar = new wow(list2);
                ((nvy) obj).e(list2.size(), new bkd0.b(new byo(18), wowVar), new bkd0.c(wowVar), new jai(802480018, new bkd0.d(wowVar, (bkd0) obj3, (izs) obj2), true));
                break;
            case 10:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj2;
                ((SQLiteStatement) obj4).executeUpdateDelete();
                for (UserId userId2 : (ArrayList) obj3) {
                    sQLiteStatement.bindLong(1, i2);
                    sQLiteStatement.bindLong(2, userId2.b);
                    sQLiteStatement.executeUpdateDelete();
                    i2++;
                }
                break;
            default:
                String str3 = (String) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                FragmentImpl fragmentImpl = (FragmentImpl) obj;
                qfx0.d.getClass();
                String b = str3 != null ? air.b('&', "aid=", str3) : "";
                StringBuilder sb = new StringBuilder("vkpay&hash=");
                StringBuilder b2 = ho8.b(b, "action=");
                if (str4 == null) {
                    str4 = "";
                }
                b2.append(str4);
                if (str5 == null) {
                    str5 = "";
                }
                b2.append(str5);
                sb.append(Uri.encode(b2.toString()));
                String sb2 = sb.toString();
                int i5 = VkPayFragment.g0;
                VkPayFragment.b.b(sb2).g(104, fragmentImpl);
                break;
        }
        return s3q0.a;
    }
}
