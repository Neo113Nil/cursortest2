package xsna;

import com.vk.music.playlist.framework.presentation.PlaylistScreenContentType;
import java.util.List;

/* compiled from: PlaylistItems.kt */
/* loaded from: classes3.dex */
public abstract class mab0<ItemType> {
    public final List<ItemType> a;

    /* JADX WARN: Multi-variable type inference failed */
    public mab0(List<? extends ItemType> list) {
        this.a = list;
    }

    public abstract PlaylistScreenContentType a(int i);

    public abstract Object b(int i);
}
