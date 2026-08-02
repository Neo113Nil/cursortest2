package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.profile.user.impl.domain.edit.models.ExternalEvent;
import com.vk.story.viewer.stat.data.cache.viewers.replies.RepliesCachedData;
import com.vk.story.viewer.stat.data.cache.viewers.replies.RepliesKey;
import com.vk.voip.ui.history.friends.ui.a;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.CoroutineStart;
import one.video.exo.offline.DownloadInfo;
import xsna.bqw0;
import xsna.hq80;
import xsna.imw0;
import xsna.lta;
import xsna.nii0;
import xsna.plc0;
import xsna.v7h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class eci0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eci0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [androidx.fragment.app.Fragment, xsna.zzu0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ImageSize Cb;
        PrivateFiles.a b;
        HashMap f;
        Collection values;
        int i = this.b;
        int i2 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                myc0.h((yvj) obj3, null, CoroutineStart.UNDISPATCHED, new gci0((wfd) obj2, (us2) obj, null), 1);
                return s3q0.a;
            case 1:
                ((tii0) obj3).C(new nii0.h(((nii0.i) obj2).b));
                return s3q0.a;
            case 2:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj3;
                float floatValue = ref$FloatRef.element - ((Float) obj).floatValue();
                ref$FloatRef.element = floatValue;
                ((izs) obj2).invoke(Float.valueOf(floatValue));
                return s3q0.a;
            case 3:
                s3l0 s3l0Var = (s3l0) obj2;
                ((StickerStockItem) obj3).R = Boolean.TRUE;
                d790 d790Var = s3l0Var.d;
                s3l0Var.z(d790Var != null ? d790Var : null, false);
                return s3q0.a;
            case 4:
                zgm0 zgm0Var = (zgm0) obj3;
                List list = (List) obj2;
                Map map = (Map) obj;
                ArrayList v = c5g.v(map.values());
                ArrayList arrayList = new ArrayList(c5g.u(v, 10));
                Iterator it = v.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StoriesContainer) it.next()).g);
                }
                ArrayList v2 = c5g.v(arrayList);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = v2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (list.contains((StoryEntry) next)) {
                        arrayList2.add(next);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                boolean z = false;
                while (it3.hasNext()) {
                    ((StoryEntry) it3.next()).h = true;
                    z = true;
                }
                ArrayList v3 = c5g.v(map.values());
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = v3.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    StoriesContainer storiesContainer = (StoriesContainer) next2;
                    if (p4g.b(storiesContainer.g, list)) {
                        CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = storiesContainer.g;
                        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                            Iterator<StoryEntry> it5 = copyOnWriteArrayList.iterator();
                            while (it5.hasNext()) {
                                if (!it5.next().h) {
                                    break;
                                }
                            }
                        }
                        arrayList3.add(next2);
                    }
                }
                Iterator it6 = arrayList3.iterator();
                boolean z2 = z;
                while (it6.hasNext()) {
                    ((StoriesContainer) it6.next()).e = false;
                    z2 = true;
                }
                if (!z2) {
                    return io.reactivex.rxjava3.internal.operators.completable.i.b;
                }
                pgm0 pgm0Var = (pgm0) zgm0Var.b.f.b;
                pgm0Var.getClass();
                return new io.reactivex.rxjava3.internal.operators.completable.m(new blq(i2, pgm0Var, new RepliesCachedData((Map<RepliesKey, ? extends List<? extends StoriesContainer>>) map))).q(asu0.a.c());
            case 5:
                ((aim0) obj3).b.h((hyg0) obj, (bim0) obj2);
                return s3q0.a;
            case 6:
                rb80 rb80Var = (rb80) obj2;
                plc0.d dVar = (plc0.d) ((tnn0) obj3).m;
                if (dVar instanceof plc0.d.a) {
                    rb80Var.a();
                } else if (dVar instanceof plc0.d.c) {
                    rb80Var.e();
                } else {
                    if (!(dVar instanceof plc0.d.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rb80Var.d();
                }
                return s3q0.a;
            case 7:
                List list2 = (List) obj3;
                niq0 niq0Var = (niq0) obj2;
                f4z<ExternalEvent> f4zVar = niq0Var.B;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                if (list2.contains(lta.a.c.C3294a.a)) {
                    Image image = extendedUserProfile.a.O;
                    if (!extendedUserProfile.n0) {
                        image = null;
                    }
                    dvq0 dvq0Var = niq0Var.j;
                    String str = (image == null || (Cb = image.Cb(400, true, false)) == null) ? null : Cb.d.d;
                    if (str == null) {
                        str = "";
                    }
                    Intent putExtra = new Intent("com.vkontakte.android.USER_PHOTO_CHANGED").putExtra("photo", str).putExtra("image", image).putExtra("id", dvq0Var.c());
                    Context context = e43.a;
                    n2i0.a(context != null ? context : null, hf8.a, putExtra);
                    dvq0Var.l(str);
                }
                List list3 = list2;
                boolean z3 = list3 instanceof Collection;
                if (!z3 || !list3.isEmpty()) {
                    Iterator it7 = list3.iterator();
                    while (it7.hasNext()) {
                        if (((lta.a) it7.next()) instanceof lta.a.C3293a) {
                            f4zVar.b(new ExternalEvent.ShowSnackbar(null, R.drawable.vk_icon_error_circle_outline_24, R.string.user_profile_changes_not_saved, 17, 0));
                            return s3q0.a;
                        }
                    }
                }
                if (!z3 || !list3.isEmpty()) {
                    Iterator it8 = list3.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            if (((lta.a) it8.next()) instanceof lta.a.c) {
                                f4zVar.b(new ExternalEvent.ShowSnackbar(null, R.drawable.vk_icon_check_circle_on_24, R.string.user_profile_changes_saved, 17, 0));
                            }
                        }
                    }
                }
                return s3q0.a;
            case 8:
                hq80.a aVar = (hq80.a) obj2;
                bu70 L = ((c0t0) obj3).L();
                long j = 0;
                if (L != null && (f = L.f()) != null && (values = f.values()) != null) {
                    Iterator it9 = values.iterator();
                    while (it9.hasNext()) {
                        j += w8o.b((DownloadInfo) it9.next());
                    }
                }
                long j2 = aVar.b.a + j;
                r6m r6mVar = r6m.a;
                b = e8r.a.b(r1, PrivateSubdir.VIDEO_DOWNLOADS_INTERNAL.h(), true);
                String absolutePath = b.a.getAbsolutePath();
                r6mVar.getClass();
                return Boolean.valueOf(r6m.b(absolutePath) - 52428800 > j2);
            case 9:
                yzu0 yzu0Var = (yzu0) obj3;
                ArrayList u0 = j5g.u0(j5g.O0((ArrayList) obj2), j5g.O0((List) obj));
                yzu0Var.c = u0;
                yzu0Var.b.vd(u0);
                return s3q0.a;
            case 10:
                ylw0 ylw0Var = (ylw0) obj2;
                View view = (View) obj;
                int i3 = ylw0.x1;
                if (((imw0.a.C3063a) obj3).a.length() == 0) {
                    view.requestFocus();
                    VkInputSelect vkInputSelect = ylw0Var.r1;
                    mhy.j(vkInputSelect != null ? vkInputSelect : null);
                }
                return s3q0.a;
            case 11:
                ((opw0) obj3).l.a(new a.b.C2059b((bqw0.b) obj2));
                return s3q0.a;
            default:
                int i4 = VoipScheduledCallsFragment.c0;
                ((VoipScheduledCallsFragment) obj3).fo((v7h0.a) obj, (VoipScheduledCallsFragment.b) obj2);
                return s3q0.a;
        }
    }
}
