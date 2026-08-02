package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PermissionType;
import xsna.efc0;

/* compiled from: PermissionsFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class iy90 {
    public final efc0.a a;

    /* compiled from: PermissionsFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PermissionType.values().length];
            try {
                iArr[PermissionType.GalleryView.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionType.Camera.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionType.Location.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public iy90(efc0.a aVar) {
        this.a = aVar;
    }
}
