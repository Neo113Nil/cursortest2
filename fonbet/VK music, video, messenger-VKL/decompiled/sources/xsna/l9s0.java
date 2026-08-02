package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.newsfeed.Owner;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.av20;
import xsna.dw20;

/* compiled from: VideoCatalogNewContentBottomSheet.kt */
/* loaded from: classes16.dex */
public final class l9s0 implements w8i {
    public final Object b;
    public final Object c;
    public dw20 d;

    /* compiled from: VideoCatalogNewContentBottomSheet.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v8, types: [xsna.zrp] */
        public static void a(Context context, Owner owner) {
            ArrayList arrayList;
            l9s0 l9s0Var = new l9s0();
            UiTracker uiTracker = UiTracker.a;
            int i = 2;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoUploadClick(MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventType.THINK_ABOUT_UPLOAD, null, i, false ? 1 : 0), 2)).q();
            av20.a aVar = new av20.a();
            dhr0.a.getClass();
            aVar.d(R.layout.actions_popup_item, LayoutInflater.from(dhr0.E()));
            aVar.d = new m9s0();
            aVar.e = new n9s0(l9s0Var, context, owner);
            av20 b = aVar.b();
            if (BuildInfo.q()) {
                arrayList = b.h();
            } else {
                zrp<b> h = b.h();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : h) {
                    if (((b) obj) != b.CREATE_CLIP) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            }
            b.setItems(arrayList);
            l9s0Var.d = ((dw20.b) dw20.a.k(new dw20.b(context, null), b, 4)).Z(new yex(l9s0Var, i)).I0("catalog_video_create_new");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoCatalogNewContentBottomSheet.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b BEGIN_LIVE;
        public static final b CREATE_CLIP;
        public static final b NEW_PLAYLIST;
        public static final b UPLOAD_VIDEO;
        private final int iconResId;
        private final int nameResId;

        static {
            b bVar = new b("UPLOAD_VIDEO", 0, R.drawable.vk_icon_video_square_outline_28, R.string.video_playlist_bottom_menu_upload_video);
            UPLOAD_VIDEO = bVar;
            b bVar2 = new b("CREATE_CLIP", 1, R.drawable.vk_icon_logo_clips_outline_28, R.string.video_create_clip_from_video);
            CREATE_CLIP = bVar2;
            b bVar3 = new b("BEGIN_LIVE", 2, R.drawable.vk_icon_live_outline_28, R.string.live_story_end_start_streaming);
            BEGIN_LIVE = bVar3;
            b bVar4 = new b("NEW_PLAYLIST", 3, R.drawable.vk_icon_list_add_outline_28, R.string.catalog_video_menu_create_playlist);
            NEW_PLAYLIST = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b(String str, int i, int i2, int i3) {
            this.iconResId = i2;
            this.nameResId = i3;
        }

        public static zrp<b> h() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int i() {
            return this.iconResId;
        }

        public final int j() {
            return this.nameResId;
        }
    }

    /* compiled from: VideoCatalogNewContentBottomSheet.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.BEGIN_LIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.NEW_PLAYLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.UPLOAD_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.CREATE_CLIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public l9s0() {
        qah0 qah0Var = new qah0(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, qah0Var);
        this.c = msy.a(lazyThreadSafetyMode, new qbc0(this, 25));
    }
}
