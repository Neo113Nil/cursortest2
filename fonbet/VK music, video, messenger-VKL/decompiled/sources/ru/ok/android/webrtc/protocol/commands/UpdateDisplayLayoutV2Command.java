package ru.ok.android.webrtc.protocol.commands;

import androidx.annotation.NonNull;
import defpackage.q0;
import java.util.List;
import java.util.Objects;
import ru.ok.android.webrtc.layout.internal.ServerDisplayLayoutItem;
import ru.ok.android.webrtc.protocol.RtcCommand;

/* loaded from: classes9.dex */
public class UpdateDisplayLayoutV2Command implements RtcCommand<UpdateDisplayLayoutV2Response> {
    public final boolean isSnapshot;

    @NonNull
    public final List<ServerDisplayLayoutItem> layouts;

    public UpdateDisplayLayoutV2Command(@NonNull List<ServerDisplayLayoutItem> list, boolean z) {
        if (list == null) {
            throw new IllegalArgumentException("Illegal 'layouts' value: null");
        }
        this.layouts = list;
        this.isSnapshot = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            UpdateDisplayLayoutV2Command updateDisplayLayoutV2Command = (UpdateDisplayLayoutV2Command) obj;
            if (this.isSnapshot == updateDisplayLayoutV2Command.isSnapshot && this.layouts.equals(updateDisplayLayoutV2Command.layouts)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.layouts, Boolean.valueOf(this.isSnapshot));
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommand
    public boolean isNotify() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UpdateDisplayLayoutV2Command{layouts=");
        sb.append(this.layouts);
        sb.append(", isSnapshot=");
        return q0.a(sb, this.isSnapshot, '}');
    }
}
