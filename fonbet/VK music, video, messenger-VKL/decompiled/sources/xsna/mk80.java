package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;

/* compiled from: OneVideoDialogOneLineItemViewBinding.java */
/* loaded from: classes8.dex */
public final class mk80 implements xtt0 {

    @NonNull
    public final ConstraintLayout a;

    @NonNull
    public final AppCompatImageView b;

    @NonNull
    public final AppCompatTextView c;

    public mk80(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = appCompatTextView;
    }

    @NonNull
    public static mk80 a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.one_video_dialog_one_line_item_view, viewGroup, false);
        int i = R.id.icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) k9q0.j(R.id.icon, inflate);
        if (appCompatImageView != null) {
            i = R.id.title;
            AppCompatTextView appCompatTextView = (AppCompatTextView) k9q0.j(R.id.title, inflate);
            if (appCompatTextView != null) {
                return new mk80((ConstraintLayout) inflate, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}
