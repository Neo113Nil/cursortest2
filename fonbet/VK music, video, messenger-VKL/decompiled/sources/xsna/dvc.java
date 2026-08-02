package xsna;

import com.vk.clips.editor.callbacks.tracker.UndoRedoEventSubtype;
import com.vkontakte.android.R;

/* compiled from: ClipEditorHistoryItemType.kt */
/* loaded from: classes16.dex */
public final class dvc implements luc {
    public static final dvc a = new dvc();
    public static final UndoRedoEventSubtype b = UndoRedoEventSubtype.REMOVE_FRAGMENT;

    @Override // xsna.luc
    public final Integer a() {
        return Integer.valueOf(R.string.clips_editor_undo_redo_text_deleted);
    }

    @Override // xsna.luc
    public final Integer b() {
        return Integer.valueOf(R.string.clips_editor_undo_redo_text_added);
    }

    @Override // xsna.luc
    public final UndoRedoEventSubtype c() {
        return b;
    }
}
