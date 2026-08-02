package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.favorites.api.params.ClipsFavoritesFoldersPickerParams;
import com.vk.clips.favorites.impl.ui.folders.picker.a;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dh6;
import xsna.dw20;
import xsna.m4e;

/* compiled from: ClipsFavoritesFoldersPickerContentView.kt */
/* loaded from: classes16.dex */
public final class p4e {
    public final Context a;
    public final qr0 b;
    public final dh6.a c;
    public final View d;
    public final ProgressBar e;
    public final ComposeView f;
    public final a g;
    public final View h;
    public final RecyclerView i;
    public final List<View> j;
    public dw20 k;
    public ez20 l;
    public i4 m;

    /* compiled from: ClipsFavoritesFoldersPickerContentView.kt */
    public static final class a {
        public final VkCell a;

        public a(VkCell vkCell) {
            this.a = vkCell;
        }
    }

    /* compiled from: ClipsFavoritesFoldersPickerContentView.kt */
    public final class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            p4e p4eVar = p4e.this;
            ez20 ez20Var = p4eVar.l;
            if (ez20Var != null) {
                ez20Var.Qc("ClipsFavoritesFoldersPickerContentView");
            }
            p4eVar.l = null;
            p4eVar.i.setAdapter(null);
            p4eVar.g.a.setLeft((VkCell.Left.b) null);
            p4eVar.b.invoke(a.b.b);
        }
    }

    /* compiled from: ClipsFavoritesFoldersPickerContentView.kt */
    public final class d implements iz20 {
        public d() {
        }

        @Override // xsna.iz20
        public final void n(dw20 dw20Var) {
            ez20 ez20Var = p4e.this.l;
            if (ez20Var != null) {
                ez20Var.Ff("ClipsFavoritesFoldersPickerContentView");
            }
        }
    }

    public p4e(Context context, qr0 qr0Var, dh6.a aVar, ClipsFavoritesFoldersPickerParams clipsFavoritesFoldersPickerParams) {
        List<View> l;
        this.a = context;
        this.b = qr0Var;
        this.c = aVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.clips_favorites_folders_picker_content, (ViewGroup) null);
        this.d = inflate;
        this.e = (ProgressBar) inflate.findViewById(R.id.clips_favorites_folders_picker_progress);
        ComposeView composeView = (ComposeView) inflate.findViewById(R.id.clips_favorites_folders_picker_error);
        this.f = composeView;
        VkCell vkCell = (VkCell) inflate.findViewById(R.id.clips_favorites_folders_picker_all_clips_cell);
        bwt0.i0(vkCell, new go1(this, 22));
        this.g = new a(vkCell);
        View findViewById = inflate.findViewById(R.id.clips_favorites_folders_picker_separator);
        this.h = findViewById;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.clips_favorites_folders_picker_list);
        this.i = recyclerView;
        if (clipsFavoritesFoldersPickerParams instanceof ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo) {
            l = e43.l(vkCell, findViewById, recyclerView);
        } else {
            if (!(clipsFavoritesFoldersPickerParams instanceof ClipsFavoritesFoldersPickerParams.PickFolderToMoveVideos)) {
                throw new NoWhenBranchMatchedException();
            }
            l = e43.l(findViewById, recyclerView);
        }
        this.j = l;
        recyclerView.addOnScrollListener(new ye90(new il1(this, 20)));
        composeView.setContent(new jai(920666394, new com.vk.movika.tools.controls.seekbar.l(this, 4), true));
    }

    public final void a() {
        if (this.k == null) {
            Context context = this.a;
            Activity h = e3m.h(context);
            this.l = h != null ? rdi.p(h, new yg(this, 26)) : null;
            m4e.a aVar = new m4e.a(context, this.c);
            View view = this.d;
            this.k = ((dw20.b) aVar.D0(view, false).e0(new d()).Z(new c()).c(new b5e(view)).J()).w0(context.getString(R.string.clips_favorites_folders_picker_title)).z0(1).l(e3m.f(R.attr.vk_ui_background_content, context)).n(new b()).I0("ClipsFavoritesFoldersPickerContentView");
        }
    }

    /* compiled from: ClipsFavoritesFoldersPickerContentView.kt */
    public final class b extends ModalBottomSheetBehavior.d {
        public b() {
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void b(int i, View view) {
            i4 i4Var;
            if (i != 3 || (i4Var = p4e.this.m) == null) {
                return;
            }
            i4Var.invoke();
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void a(View view, float f) {
        }
    }
}
