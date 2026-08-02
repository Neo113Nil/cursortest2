package xsna;

import com.vk.clips.editor.callbacks.tracker.UndoRedoEventSubtype;
import com.vkontakte.android.R;

/* compiled from: ClipEditorHistoryItemType.kt */
/* loaded from: classes16.dex */
public final class quc implements luc {
    public static final quc a = new quc();
    public static final UndoRedoEventSubtype b = UndoRedoEventSubtype.REMOVE_FRAGMENT;

    @Override // xsna.luc
    public final Integer a() {
        return Integer.valueOf(R.string.clips_editor_undo_redo_fragment_deleted);
    }

    @Override // xsna.luc
    public final Integer b() {
        return Integer.valueOf(R.string.clips_editor_undo_redo_fragment_added);
    }

    @Override // xsna.luc
    public final UndoRedoEventSubtype c() {
        return b;
    }
}
