package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.widget.TextView;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.catalog2.common.ui.mvp.holder.container.GridListVh;
import com.vk.contacts.ContactsSyncActivity;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.badges.Badgeable;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.home.HomeFragment2;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.log.L;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import xsna.e3m;
import xsna.nbx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class r5i implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r5i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((s5i) obj).a.findViewById(R.id.nativeads_rating_chip);
            case 1:
                int i3 = ContactsSyncActivity.f;
                ((ContactsSyncActivity) obj).finish();
                return s3q0.a;
            case 2:
                a7k a7kVar = (a7k) obj;
                VkGroupHeader vkGroupHeader = (VkGroupHeader) j5g.Z(a7kVar.e.values());
                if (vkGroupHeader != null) {
                    vkGroupHeader.measure(View.MeasureSpec.makeMeasureSpec(iah0.z(a7kVar.b), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    vkGroupHeader.layout(0, 0, vkGroupHeader.getMeasuredWidth(), vkGroupHeader.getMeasuredHeight());
                    i2 = a7kVar.h + vkGroupHeader.getMeasuredHeight();
                }
                return Integer.valueOf(i2);
            case 3:
                efm efmVar = ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) obj).e;
                if (efmVar != null) {
                    efmVar.l();
                }
                return s3q0.a;
            case 4:
                Context applicationContext = ((pjm) obj).a.getApplicationContext();
                asu0.a.getClass();
                return new zdh0(asu0.n(), applicationContext);
            case 5:
                ArrayList arrayList = (ArrayList) obj;
                StringBuilder sb = new StringBuilder("DialogUnpinCmd, old pinned: ");
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((com.vk.im.engine.models.dialogs.b) it.next()).b));
                }
                sb.append(arrayList2);
                return sb.toString();
            case 6:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 7:
                Context context = ((r3n) obj).a.getContext();
                HashSet hashSet = iah0.a;
                return Boolean.valueOf(fnj.d(context));
            case 8:
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                return m7m.d((DiscoverSimilarFeedFragment) obj);
            case 9:
                int i4 = DisplayMusicPlaylistFragment.b0;
                return (NewsFeedBridgeComponent) m7m.d((DisplayMusicPlaylistFragment) obj).a(fpf0.a(NewsFeedBridgeComponent.class));
            case 10:
                ((cdo) obj).b = null;
                return s3q0.a;
            case 11:
                boo booVar = (boo) obj;
                Context context2 = booVar.b.getContext();
                e3m.a aVar = e3m.a;
                return new InsetDrawable(m33.a(R.drawable.vk_icon_connection_16, context2), 0, 0, booVar.e, 0);
            case 12:
                HashMap hashMap = new HashMap();
                bpn0 bpn0Var = ((iep) obj).a;
                String string = ((SharedPreferences) bpn0Var.getValue()).getString("emoji_user_picked_variants", "");
                if (string != null && string.length() > 0) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, jSONObject.getString(next));
                        }
                    } catch (Exception unused) {
                        L.l("EmojiUserPickedVariantsStore", "Can't parse emoji user picked variants json map");
                        ((SharedPreferences) bpn0Var.getValue()).edit().putString("emoji_user_picked_variants", "").apply();
                    }
                }
                return hashMap;
            case 13:
                Object obj2 = mqp.S;
                return (androidx.lifecycle.m) ((mqp) obj).P.getValue();
            case 14:
                ((o4r) obj).j1.setValue(new VkFeedSearchParams());
                return s3q0.a;
            case 15:
                f6s f6sVar = (f6s) obj;
                q6s j7 = f6sVar.j7();
                if (j7 != null) {
                    c6z Q = di60.Q(j7.h0);
                    f6sVar.E.d(f6sVar.itemView.getContext(), Q instanceof Badgeable ? (Badgeable) Q : null);
                }
                return s3q0.a;
            case 16:
                ((yis) obj).q6();
                return s3q0.a;
            case 17:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) obj;
                int i5 = GalleryFragmentImpl.R0;
                return new com.vk.core.simplescreen.a(galleryFragmentImpl.kn(), galleryFragmentImpl.R.E.e, false);
            case 18:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.f((wht) obj)).a(fpf0.a(StoryEditorExtDepsComponent.class))).K2();
            case 19:
                return ((GridListVh) obj).l;
            case 20:
                int i6 = HomeFragment2.x0;
                return (Boolean) ((ncg) obj).invoke();
            case 21:
                hbt0 hbt0Var = ((z8w) obj).i;
                (hbt0Var != null ? hbt0Var : null).y();
                return s3q0.a;
            case 22:
                return new nbx.c((nbx) obj);
            case 23:
                return (TextView) ((qex) obj).itemView.findViewById(R.id.video_single_clip_owner);
            case 24:
                return new wh0(new g4g((n1y) obj, 26));
            case 25:
                return ((x6y) obj).l;
            case 26:
                return com.vk.clips.sdk.shared.item.market_ads.b.q((com.vk.clips.sdk.shared.item.market_ads.b) obj);
            case 27:
                return ((bg20) obj).b.a(OpenMessagesHistoryReporter.Span.LOADER_SPINNER);
            case 28:
                ((sq20) obj).f.invoke();
                return s3q0.a;
            default:
                return ((jl30) obj).b.a(OpenMessagesHistoryReporter.Span.LOAD_MESSAGES_HISTORY_TOTAL);
        }
    }
}
