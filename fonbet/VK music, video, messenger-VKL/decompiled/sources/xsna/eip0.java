package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.music.player.PlayerTrack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/* compiled from: Tracks.java */
/* loaded from: classes3.dex */
public final class eip0 {
    public final CopyOnWriteArrayList<PlayerTrack> a;
    public final HashMap b;

    public eip0() {
        CopyOnWriteArrayList<PlayerTrack> copyOnWriteArrayList = new CopyOnWriteArrayList<>(new ArrayList());
        this.a = copyOnWriteArrayList;
        this.b = new HashMap();
        e(copyOnWriteArrayList);
    }

    @Nullable
    public final PlayerTrack a(int i) {
        if (i < 0) {
            return null;
        }
        CopyOnWriteArrayList<PlayerTrack> copyOnWriteArrayList = this.a;
        if (i >= copyOnWriteArrayList.size()) {
            return null;
        }
        return copyOnWriteArrayList.get(i);
    }

    public final PlayerTrack b() {
        List list = (List) this.a.stream().filter(new cip0(0)).collect(Collectors.toList());
        if (list.isEmpty()) {
            return null;
        }
        return (PlayerTrack) list.get(0);
    }

    @Nullable
    public final PlayerTrack c(String str) {
        int d = d(str);
        if (d < 0) {
            return null;
        }
        CopyOnWriteArrayList<PlayerTrack> copyOnWriteArrayList = this.a;
        if (d >= copyOnWriteArrayList.size() - 1) {
            return null;
        }
        PlayerTrack playerTrack = copyOnWriteArrayList.get(d + 1);
        if (!playerTrack.b.Pb()) {
            return playerTrack;
        }
        com.vk.core.utils.newtork.b.a.getClass();
        return !com.vk.core.utils.newtork.b.d() ? c(playerTrack.f) : playerTrack;
    }

    public final int d(String str) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty()) {
            int i = 0;
            while (true) {
                CopyOnWriteArrayList<PlayerTrack> copyOnWriteArrayList = this.a;
                if (i >= copyOnWriteArrayList.size()) {
                    break;
                }
                hashMap.put(copyOnWriteArrayList.get(i).f, Integer.valueOf(i));
                i++;
            }
        }
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final void e(@NonNull CopyOnWriteArrayList copyOnWriteArrayList) {
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            PlayerTrack playerTrack = (PlayerTrack) copyOnWriteArrayList.get(i);
            playerTrack.d = i;
            this.b.put(playerTrack.f, Integer.valueOf(i));
        }
    }
}
