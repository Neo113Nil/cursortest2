package yads;

import java.util.UUID;

/* loaded from: classes10.dex */
public final class cd0 extends Exception {
    public cd0(UUID uuid) {
        super("Media does not support uuid: " + uuid);
    }
}
