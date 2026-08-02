package com.yandex.go.taxi.main.shortcuts.ui.modalview;

import android.net.Uri;
import defpackage.k4o;
import defpackage.l050;
import kotlin.Metadata;
import ru.yandex.taxi.search.address.view.PointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/main/shortcuts/ui/modalview/ShortcutModalViewMvp;", "Ll050;", "Mode", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ShortcutModalViewMvp extends l050 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/main/shortcuts/ui/modalview/ShortcutModalViewMvp$Mode;", "", "ADDRESS", "SHORTCUT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Mode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode ADDRESS;
        public static final Mode SHORTCUT;

        static {
            Mode mode = new Mode("ADDRESS", 0);
            ADDRESS = mode;
            Mode mode2 = new Mode("SHORTCUT", 1);
            SHORTCUT = mode2;
            Mode[] modeArr = {mode, mode2};
            $VALUES = modeArr;
            $ENTRIES = kotlin.enums.a.a(modeArr);
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    void F2();

    void changeShortcutsVisibility(boolean z);

    void fc();

    void jb();

    void pauseShortcuts();

    void requestFocus();

    void resumeShortcuts();

    void showEditAddress(Uri uri);

    void showEditAddress(PointType pointType);

    void updateBadgeCount(int i);

    void wb();
}
