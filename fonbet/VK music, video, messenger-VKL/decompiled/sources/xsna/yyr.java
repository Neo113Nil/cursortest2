package xsna;

import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: FolderItem.kt */
/* loaded from: classes18.dex */
public interface yyr extends hfz, a7i {
    int getId();

    CharSequence getName();

    FolderType getType();

    @Override // xsna.hfz
    default Integer getItemId() {
        return Integer.valueOf(getId());
    }
}
