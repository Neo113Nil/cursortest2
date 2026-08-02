package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.UploadVideoAction;
import com.vkontakte.android.R;
import xsna.av20;
import xsna.dw20;

/* compiled from: VideoUploadNavigator.kt */
/* loaded from: classes3.dex */
public interface mot0 {

    /* compiled from: VideoUploadNavigator.kt */
    public static final class a implements mot0 {
        public static final /* synthetic */ a a = new a();
        public static dw20 b;

        @Override // xsna.mot0
        public final void a(Context context, UserId userId, int i, String str, boolean z) {
            userId.equals(UserId.d);
            if (z || (fxc0.B().J().r0() && (BuildInfo.q() || !fkq0.d(userId)))) {
                Activity h = e3m.h(context);
                if (h == null) {
                    return;
                }
                fxc0.B().Y().c(h, UploadVideoAction.SELECT, userId, i, str);
                return;
            }
            av20.a aVar = new av20.a();
            aVar.d(R.layout.bottom_menu_simple_item_view, LayoutInflater.from(context));
            aVar.d = new kot0();
            aVar.e = new lot0(userId, i, str);
            av20 b2 = aVar.b();
            b2.setItems(e43.l(b.RECORD, b.SELECT, b.LINK));
            b = ((dw20.b) dw20.a.k(new dw20.b(context, null).Z(new jot0()), b2, 4)).I0("video_catalog_upload");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoUploadNavigator.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b LINK;
        public static final b RECORD;
        public static final b SELECT;
        private final int iconResId;
        private final int id;
        private final int nameResId;

        static {
            b bVar = new b("RECORD", 0, R.id.record, R.drawable.vk_icon_camera_outline_28, R.string.video_catalog_add_new);
            RECORD = bVar;
            b bVar2 = new b("SELECT", 1, R.id.select, R.drawable.vk_icon_picture_outline_28, R.string.video_catalog_add_existing);
            SELECT = bVar2;
            b bVar3 = new b("LINK", 2, R.id.link, R.drawable.vk_icon_link_outline_28, R.string.video_catalog_add_link);
            LINK = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b(String str, int i, int i2, int i3, int i4) {
            this.id = i2;
            this.iconResId = i3;
            this.nameResId = i4;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int h() {
            return this.iconResId;
        }

        public final int i() {
            return this.id;
        }

        public final int j() {
            return this.nameResId;
        }
    }

    static /* synthetic */ void b(mot0 mot0Var, Context context, UserId userId, int i, String str, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        mot0Var.a(context, userId, i, str, (i2 & 16) == 0);
    }

    void a(Context context, UserId userId, int i, String str, boolean z);
}
