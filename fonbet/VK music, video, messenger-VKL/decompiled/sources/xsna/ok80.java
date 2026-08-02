package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;

/* compiled from: OneVideoDialogTwoLineItemViewBinding.java */
/* loaded from: classes8.dex */
public final class ok80 implements xtt0 {

    @NonNull
    public final ConstraintLayout a;

    @NonNull
    public final ImageView b;

    @NonNull
    public final AppCompatImageView c;

    @NonNull
    public final AppCompatTextView d;

    @NonNull
    public final AppCompatTextView e;

    public ok80(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = appCompatImageView;
        this.d = appCompatTextView;
        this.e = appCompatTextView2;
    }

    @NonNull
    public static ok80 a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.one_video_dialog_two_line_item_view, viewGroup, false);
        int i = R.id.action_check_icon;
        ImageView imageView = (ImageView) k9q0.j(R.id.action_check_icon, inflate);
        if (imageView != null) {
            i = R.id.icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) k9q0.j(R.id.icon, inflate);
            if (appCompatImageView != null) {
                i = R.id.title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) k9q0.j(R.id.title, inflate);
                if (appCompatTextView != null) {
                    i = R.id.value;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) k9q0.j(R.id.value, inflate);
                    if (appCompatTextView2 != null) {
                        return new ok80((ConstraintLayout) inflate, imageView, appCompatImageView, appCompatTextView, appCompatTextView2);
                    }
                }
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
