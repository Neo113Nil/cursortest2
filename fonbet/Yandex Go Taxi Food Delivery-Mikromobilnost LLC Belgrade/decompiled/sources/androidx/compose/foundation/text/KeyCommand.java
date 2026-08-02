package androidx.compose.foundation.text;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b6\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7¨\u00068"}, d2 = {"Landroidx/compose/foundation/text/KeyCommand;", "", "", "editsText", "Z", "a", "()Z", "LEFT_CHAR", "RIGHT_CHAR", "RIGHT_WORD", "LEFT_WORD", "NEXT_PARAGRAPH", "PREV_PARAGRAPH", "LINE_START", "LINE_END", "LINE_LEFT", "LINE_RIGHT", "UP", "DOWN", "CENTER", "PAGE_UP", "PAGE_DOWN", "HOME", "END", "COPY", "PASTE", "CUT", "DELETE_PREV_CHAR", "DELETE_NEXT_CHAR", "DELETE_PREV_WORD", "DELETE_NEXT_WORD", "DELETE_FROM_LINE_START", "DELETE_TO_LINE_END", "SELECT_ALL", "SELECT_LEFT_CHAR", "SELECT_RIGHT_CHAR", "SELECT_UP", "SELECT_DOWN", "SELECT_PAGE_UP", "SELECT_PAGE_DOWN", "SELECT_HOME", "SELECT_END", "SELECT_LEFT_WORD", "SELECT_RIGHT_WORD", "SELECT_NEXT_PARAGRAPH", "SELECT_PREV_PARAGRAPH", "SELECT_LINE_START", "SELECT_LINE_END", "SELECT_LINE_LEFT", "SELECT_LINE_RIGHT", "DESELECT", "NEW_LINE", "TAB", "UNDO", "REDO", "CHARACTER_PALETTE", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class KeyCommand {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ KeyCommand[] $VALUES;
    public static final KeyCommand CENTER;
    public static final KeyCommand CHARACTER_PALETTE;
    public static final KeyCommand COPY;
    public static final KeyCommand CUT;
    public static final KeyCommand DELETE_FROM_LINE_START;
    public static final KeyCommand DELETE_NEXT_CHAR;
    public static final KeyCommand DELETE_NEXT_WORD;
    public static final KeyCommand DELETE_PREV_CHAR;
    public static final KeyCommand DELETE_PREV_WORD;
    public static final KeyCommand DELETE_TO_LINE_END;
    public static final KeyCommand DESELECT;
    public static final KeyCommand DOWN;
    public static final KeyCommand END;
    public static final KeyCommand HOME;
    public static final KeyCommand LEFT_CHAR;
    public static final KeyCommand LEFT_WORD;
    public static final KeyCommand LINE_END;
    public static final KeyCommand LINE_LEFT;
    public static final KeyCommand LINE_RIGHT;
    public static final KeyCommand LINE_START;
    public static final KeyCommand NEW_LINE;
    public static final KeyCommand NEXT_PARAGRAPH;
    public static final KeyCommand PAGE_DOWN;
    public static final KeyCommand PAGE_UP;
    public static final KeyCommand PASTE;
    public static final KeyCommand PREV_PARAGRAPH;
    public static final KeyCommand REDO;
    public static final KeyCommand RIGHT_CHAR;
    public static final KeyCommand RIGHT_WORD;
    public static final KeyCommand SELECT_ALL;
    public static final KeyCommand SELECT_DOWN;
    public static final KeyCommand SELECT_END;
    public static final KeyCommand SELECT_HOME;
    public static final KeyCommand SELECT_LEFT_CHAR;
    public static final KeyCommand SELECT_LEFT_WORD;
    public static final KeyCommand SELECT_LINE_END;
    public static final KeyCommand SELECT_LINE_LEFT;
    public static final KeyCommand SELECT_LINE_RIGHT;
    public static final KeyCommand SELECT_LINE_START;
    public static final KeyCommand SELECT_NEXT_PARAGRAPH;
    public static final KeyCommand SELECT_PAGE_DOWN;
    public static final KeyCommand SELECT_PAGE_UP;
    public static final KeyCommand SELECT_PREV_PARAGRAPH;
    public static final KeyCommand SELECT_RIGHT_CHAR;
    public static final KeyCommand SELECT_RIGHT_WORD;
    public static final KeyCommand SELECT_UP;
    public static final KeyCommand TAB;
    public static final KeyCommand UNDO;
    public static final KeyCommand UP;
    private final boolean editsText;

    static {
        KeyCommand keyCommand = new KeyCommand("LEFT_CHAR", 0, false);
        LEFT_CHAR = keyCommand;
        KeyCommand keyCommand2 = new KeyCommand("RIGHT_CHAR", 1, false);
        RIGHT_CHAR = keyCommand2;
        KeyCommand keyCommand3 = new KeyCommand("RIGHT_WORD", 2, false);
        RIGHT_WORD = keyCommand3;
        KeyCommand keyCommand4 = new KeyCommand("LEFT_WORD", 3, false);
        LEFT_WORD = keyCommand4;
        KeyCommand keyCommand5 = new KeyCommand("NEXT_PARAGRAPH", 4, false);
        NEXT_PARAGRAPH = keyCommand5;
        KeyCommand keyCommand6 = new KeyCommand("PREV_PARAGRAPH", 5, false);
        PREV_PARAGRAPH = keyCommand6;
        KeyCommand keyCommand7 = new KeyCommand("LINE_START", 6, false);
        LINE_START = keyCommand7;
        KeyCommand keyCommand8 = new KeyCommand("LINE_END", 7, false);
        LINE_END = keyCommand8;
        KeyCommand keyCommand9 = new KeyCommand("LINE_LEFT", 8, false);
        LINE_LEFT = keyCommand9;
        KeyCommand keyCommand10 = new KeyCommand("LINE_RIGHT", 9, false);
        LINE_RIGHT = keyCommand10;
        KeyCommand keyCommand11 = new KeyCommand("UP", 10, false);
        UP = keyCommand11;
        KeyCommand keyCommand12 = new KeyCommand("DOWN", 11, false);
        DOWN = keyCommand12;
        KeyCommand keyCommand13 = new KeyCommand("CENTER", 12, false);
        CENTER = keyCommand13;
        KeyCommand keyCommand14 = new KeyCommand("PAGE_UP", 13, false);
        PAGE_UP = keyCommand14;
        KeyCommand keyCommand15 = new KeyCommand("PAGE_DOWN", 14, false);
        PAGE_DOWN = keyCommand15;
        KeyCommand keyCommand16 = new KeyCommand("HOME", 15, false);
        HOME = keyCommand16;
        KeyCommand keyCommand17 = new KeyCommand("END", 16, false);
        END = keyCommand17;
        KeyCommand keyCommand18 = new KeyCommand("COPY", 17, false);
        COPY = keyCommand18;
        KeyCommand keyCommand19 = new KeyCommand("PASTE", 18, true);
        PASTE = keyCommand19;
        KeyCommand keyCommand20 = new KeyCommand("CUT", 19, true);
        CUT = keyCommand20;
        KeyCommand keyCommand21 = new KeyCommand("DELETE_PREV_CHAR", 20, true);
        DELETE_PREV_CHAR = keyCommand21;
        KeyCommand keyCommand22 = new KeyCommand("DELETE_NEXT_CHAR", 21, true);
        DELETE_NEXT_CHAR = keyCommand22;
        KeyCommand keyCommand23 = new KeyCommand("DELETE_PREV_WORD", 22, true);
        DELETE_PREV_WORD = keyCommand23;
        KeyCommand keyCommand24 = new KeyCommand("DELETE_NEXT_WORD", 23, true);
        DELETE_NEXT_WORD = keyCommand24;
        KeyCommand keyCommand25 = new KeyCommand("DELETE_FROM_LINE_START", 24, true);
        DELETE_FROM_LINE_START = keyCommand25;
        KeyCommand keyCommand26 = new KeyCommand("DELETE_TO_LINE_END", 25, true);
        DELETE_TO_LINE_END = keyCommand26;
        KeyCommand keyCommand27 = new KeyCommand("SELECT_ALL", 26, false);
        SELECT_ALL = keyCommand27;
        KeyCommand keyCommand28 = new KeyCommand("SELECT_LEFT_CHAR", 27, false);
        SELECT_LEFT_CHAR = keyCommand28;
        KeyCommand keyCommand29 = new KeyCommand("SELECT_RIGHT_CHAR", 28, false);
        SELECT_RIGHT_CHAR = keyCommand29;
        KeyCommand keyCommand30 = new KeyCommand("SELECT_UP", 29, false);
        SELECT_UP = keyCommand30;
        KeyCommand keyCommand31 = new KeyCommand("SELECT_DOWN", 30, false);
        SELECT_DOWN = keyCommand31;
        KeyCommand keyCommand32 = new KeyCommand("SELECT_PAGE_UP", 31, false);
        SELECT_PAGE_UP = keyCommand32;
        KeyCommand keyCommand33 = new KeyCommand("SELECT_PAGE_DOWN", 32, false);
        SELECT_PAGE_DOWN = keyCommand33;
        KeyCommand keyCommand34 = new KeyCommand("SELECT_HOME", 33, false);
        SELECT_HOME = keyCommand34;
        KeyCommand keyCommand35 = new KeyCommand("SELECT_END", 34, false);
        SELECT_END = keyCommand35;
        KeyCommand keyCommand36 = new KeyCommand("SELECT_LEFT_WORD", 35, false);
        SELECT_LEFT_WORD = keyCommand36;
        KeyCommand keyCommand37 = new KeyCommand("SELECT_RIGHT_WORD", 36, false);
        SELECT_RIGHT_WORD = keyCommand37;
        KeyCommand keyCommand38 = new KeyCommand("SELECT_NEXT_PARAGRAPH", 37, false);
        SELECT_NEXT_PARAGRAPH = keyCommand38;
        KeyCommand keyCommand39 = new KeyCommand("SELECT_PREV_PARAGRAPH", 38, false);
        SELECT_PREV_PARAGRAPH = keyCommand39;
        KeyCommand keyCommand40 = new KeyCommand("SELECT_LINE_START", 39, false);
        SELECT_LINE_START = keyCommand40;
        KeyCommand keyCommand41 = new KeyCommand("SELECT_LINE_END", 40, false);
        SELECT_LINE_END = keyCommand41;
        KeyCommand keyCommand42 = new KeyCommand("SELECT_LINE_LEFT", 41, false);
        SELECT_LINE_LEFT = keyCommand42;
        KeyCommand keyCommand43 = new KeyCommand("SELECT_LINE_RIGHT", 42, false);
        SELECT_LINE_RIGHT = keyCommand43;
        KeyCommand keyCommand44 = new KeyCommand("DESELECT", 43, false);
        DESELECT = keyCommand44;
        KeyCommand keyCommand45 = new KeyCommand("NEW_LINE", 44, true);
        NEW_LINE = keyCommand45;
        KeyCommand keyCommand46 = new KeyCommand("TAB", 45, true);
        TAB = keyCommand46;
        KeyCommand keyCommand47 = new KeyCommand("UNDO", 46, true);
        UNDO = keyCommand47;
        KeyCommand keyCommand48 = new KeyCommand("REDO", 47, true);
        REDO = keyCommand48;
        KeyCommand keyCommand49 = new KeyCommand("CHARACTER_PALETTE", 48, true);
        CHARACTER_PALETTE = keyCommand49;
        KeyCommand[] keyCommandArr = {keyCommand, keyCommand2, keyCommand3, keyCommand4, keyCommand5, keyCommand6, keyCommand7, keyCommand8, keyCommand9, keyCommand10, keyCommand11, keyCommand12, keyCommand13, keyCommand14, keyCommand15, keyCommand16, keyCommand17, keyCommand18, keyCommand19, keyCommand20, keyCommand21, keyCommand22, keyCommand23, keyCommand24, keyCommand25, keyCommand26, keyCommand27, keyCommand28, keyCommand29, keyCommand30, keyCommand31, keyCommand32, keyCommand33, keyCommand34, keyCommand35, keyCommand36, keyCommand37, keyCommand38, keyCommand39, keyCommand40, keyCommand41, keyCommand42, keyCommand43, keyCommand44, keyCommand45, keyCommand46, keyCommand47, keyCommand48, keyCommand49};
        $VALUES = keyCommandArr;
        $ENTRIES = kotlin.enums.a.a(keyCommandArr);
    }

    public KeyCommand(String str, int i, boolean z) {
        this.editsText = z;
    }

    public static KeyCommand valueOf(String str) {
        return (KeyCommand) Enum.valueOf(KeyCommand.class, str);
    }

    public static KeyCommand[] values() {
        return (KeyCommand[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final boolean getEditsText() {
        return this.editsText;
    }
}
