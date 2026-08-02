package xsna;

import com.vkontakte.android.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserProfileLegoAvatarContextMenu.kt */
/* loaded from: classes5.dex */
public final class rqq0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ rqq0[] $VALUES;
    public static final rqq0 DeletePhoto;
    public static final rqq0 EditPhoto;
    public static final rqq0 SetPhotoAsAvatar;
    public static final rqq0 ViewPhotos;
    private final int iconRes;
    private final int titleRes;

    static {
        rqq0 rqq0Var = new rqq0("ViewPhotos", 0, R.string.user_profile_lego_show_photos, R.drawable.vk_icon_lego_picture_outline_24);
        ViewPhotos = rqq0Var;
        rqq0 rqq0Var2 = new rqq0("EditPhoto", 1, R.string.user_profile_avatar_action_edit_photo, R.drawable.vk_icon_lego_camera_outline_24);
        EditPhoto = rqq0Var2;
        rqq0 rqq0Var3 = new rqq0("SetPhotoAsAvatar", 2, R.string.user_profile_lego_set_photo_as_avatar, R.drawable.vk_icon_lego_user_outline_20);
        SetPhotoAsAvatar = rqq0Var3;
        rqq0 rqq0Var4 = new rqq0("DeletePhoto", 3, R.string.user_profile_avatar_action_delete_photo, R.drawable.vk_icon_lego_delete_outline_24);
        DeletePhoto = rqq0Var4;
        rqq0[] rqq0VarArr = {rqq0Var, rqq0Var2, rqq0Var3, rqq0Var4};
        $VALUES = rqq0VarArr;
        $ENTRIES = new asp(rqq0VarArr);
    }

    public rqq0(String str, int i, int i2, int i3) {
        this.titleRes = i2;
        this.iconRes = i3;
    }

    public static rqq0 valueOf(String str) {
        return (rqq0) Enum.valueOf(rqq0.class, str);
    }

    public static rqq0[] values() {
        return (rqq0[]) $VALUES.clone();
    }

    public final int h() {
        return this.iconRes;
    }

    public final int i() {
        return this.titleRes;
    }
}
