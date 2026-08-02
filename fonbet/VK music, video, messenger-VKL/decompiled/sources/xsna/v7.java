package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.attachpicker.fragment.gallery.FastScroller;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.file_picker.external.e;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.views.counter.AnimatedCounterView;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.media.MediaFilteringStrategy;
import com.vk.music.playlist.framework.presentation.PlaylistScreenContentType;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.profile.core.scheduled_clips.f;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.ayv0;
import xsna.c2r0;
import xsna.cbm;
import xsna.fi3;
import xsna.io8;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v7 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ v7(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bd A[SYNTHETIC] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        c2r0.b bVar;
        xf7 xf7Var;
        switch (this.b) {
            case 0:
                return Collections.singletonList(new AboutVideoItem.n((List) obj));
            case 1:
                qgi0.r((tgi0) obj, "anonymousProfileSubtitle");
                return s3q0.a;
            case 2:
                return s3q0.a;
            case 3:
                int i = AllHighlightsFragment.g0;
                qgi0.r((tgi0) obj, "toolbar");
                return s3q0.a;
            case 4:
                qcy<Object>[] qcyVarArr = AnimatedCounterView.w;
                ((AnimatedCounterView) obj).invalidate();
                return s3q0.a;
            case 5:
                return new ayv0.c((String) obj);
            case 6:
                hh3 hh3Var = (hh3) obj;
                List<fi3> list = hh3Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!(((fi3) obj2) instanceof fi3.a)) {
                        arrayList.add(obj2);
                    }
                }
                return hh3.a(hh3Var, arrayList);
            case 7:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 8:
                ((Integer) obj).intValue();
                return PlaylistScreenContentType.TRACK_ITEM;
            case 9:
                View view = (View) obj;
                return Boolean.valueOf((view instanceof EditText) && ((EditText) view).isFocused());
            case 10:
                Map unmodifiableMap = Collections.unmodifiableMap(((RetrieveBytesResponse) obj).d);
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : unmodifiableMap.entrySet()) {
                    String str = (String) entry.getKey();
                    RetrieveBytesResponse.BlockstoreData blockstoreData = (RetrieveBytesResponse.BlockstoreData) entry.getValue();
                    Long n = arm0.n(str);
                    if (n != null) {
                        long longValue = n.longValue();
                        UserId userId = new UserId(longValue);
                        byte[] bArr = blockstoreData.b;
                        if (bArr != null && bArr.length != 0 && fkq0.c(userId)) {
                            String str2 = new String(bArr, emb.b);
                            if (!drm0.N(str2)) {
                                List b0 = drm0.b0(str2, new char[]{';'}, 0, 6);
                                String str3 = (String) j5g.b0(0, b0);
                                if (str3 == null || drm0.N(str3)) {
                                    str3 = null;
                                }
                                AccountProfileType.a aVar = AccountProfileType.Companion;
                                String str4 = (String) j5g.b0(1, b0);
                                Integer m = str4 != null ? arm0.m(10, str4) : null;
                                aVar.getClass();
                                AccountProfileType a = AccountProfileType.a.a(m);
                                if (a == null) {
                                    a = AccountProfileType.NORMAL;
                                }
                                String str5 = (String) j5g.b0(2, b0);
                                if (str5 == null || drm0.N(str5)) {
                                    str5 = null;
                                }
                                if (str3 != null && str5 != null) {
                                    xf7Var = new xf7(userId, str3, a, str5);
                                    if (xf7Var != null) {
                                        bVar = new c2r0.b(new UserId(longValue), xf7Var.d, null, xf7Var.b, false, xf7Var.c);
                                        if (bVar == null) {
                                            arrayList2.add(bVar);
                                        }
                                    }
                                }
                            }
                        }
                        xf7Var = null;
                        if (xf7Var != null) {
                        }
                    }
                    bVar = null;
                    if (bVar == null) {
                    }
                }
                return arrayList2;
            case 11:
                return Boolean.valueOf(((BookingCalendarScreenState) obj).b);
            case 12:
                cbm.a aVar2 = (cbm.a) obj;
                Dialog dialog = aVar2.c;
                ProfilesInfo profilesInfo = aVar2.e;
                Integer a2 = aVar2.b.a();
                return (dialog == null || profilesInfo == null || a2 == null) ? io8.a.a : new io8.b(a2.intValue(), profilesInfo, dialog, aVar2.d);
            case 13:
                VkImage vkImage = new VkImage((Context) obj, null, 6, 0);
                vkImage.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                return vkImage;
            case 14:
                qgi0.r((tgi0) obj, "COMMON_GRID_TOOLBAR_TITLE_TEST_TAG");
                return s3q0.a;
            case 15:
                return Boolean.valueOf(((nmv) obj) instanceof ClipsGridHeaderEntry.b);
            case 16:
                qgi0.r((tgi0) obj, "AUTHOR_TITLE_TEST_TAG");
                return s3q0.a;
            case 17:
                return "-list".concat((String) obj);
            case 18:
                Intent intent = (Intent) obj;
                intent.putExtra("total_selection_limit", 30);
                intent.putExtra("selection_limit", 30);
                intent.putExtra("video_min_length_ms", 100L);
                intent.putExtra("video_max_length_ms", ynd.a);
                intent.putExtra("media_type", 111);
                intent.putExtra("camera_enabled", false);
                intent.putExtra("clips_picker", true);
                intent.putExtra("prevent_styling", true);
                intent.putExtra("video_filtering_mode", MediaFilteringStrategy.VIDEO_AVC_HEVC);
                intent.putExtra("long_previews", true);
                intent.putExtra("short_divider", true);
                intent.putExtra("prevent_styling_photo", false);
                intent.putExtra("single_mode", false);
                return s3q0.a;
            case 19:
                return s3q0.a;
            case 20:
                UsableRecyclerView usableRecyclerView = new UsableRecyclerView((Context) obj);
                usableRecyclerView.setId(R.id.community_internal_menu);
                usableRecyclerView.getContext();
                usableRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                ((androidx.recyclerview.widget.n0) usableRecyclerView.getItemAnimator()).g = false;
                usableRecyclerView.setClipToPadding(false);
                int a3 = iah0.a(8);
                f4m.B(a3, a3, usableRecyclerView);
                int a4 = iah0.a(12);
                f4m.l(a4, a4, usableRecyclerView);
                return usableRecyclerView;
            case 21:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 22:
                tj50.a aVar3 = (tj50.a) obj;
                w0i w0iVar = w0i.b;
                ao8 ao8Var = ao8.d;
                return new f.a(aVar3.a(w0iVar, ao8Var), aVar3.a(x0i.b, ao8Var), aVar3.a(y0i.b, ao8Var), aVar3.a(z0i.b, ao8Var));
            case 23:
                return Boolean.valueOf(((hyl) obj).b());
            case 24:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_msg_header_menu_change_theme);
            case 25:
                int i2 = kwg0.a;
                return s3q0.a;
            case 26:
                u3o u3oVar = (u3o) obj;
                String str6 = u3oVar.e;
                return new x3o(u3oVar.b, u3oVar.c, str6 == null ? u3oVar.h : str6, u3oVar.f, !epx.f(r8, r3), u3oVar.d, u3oVar.g);
            case 27:
                qgi0.r((tgi0) obj, "drafts_list_toolbar_title");
                return s3q0.a;
            case 28:
                return e.c.a;
            default:
                int i3 = FastScroller.v;
                return ((ViewPropertyAnimator) obj).alpha(1.0f).setDuration(300L);
        }
    }

    public /* synthetic */ v7(Object obj, int i) {
        this.b = i;
    }
}
