package xsna;

import android.content.Context;
import com.vk.newsfeed.posting.impl.domain.model.PermissionType;

/* compiled from: PermissionsRepository.kt */
/* loaded from: classes4.dex */
public final class jy90 {
    public final Context a;

    /* compiled from: PermissionsRepository.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PermissionType.values().length];
            try {
                iArr[PermissionType.Camera.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionType.GalleryView.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionType.Location.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public jy90(Context context) {
        this.a = context;
    }
}
