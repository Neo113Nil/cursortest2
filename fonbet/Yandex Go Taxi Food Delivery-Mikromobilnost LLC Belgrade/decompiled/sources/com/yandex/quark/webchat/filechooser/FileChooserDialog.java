package com.yandex.quark.webchat.filechooser;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.divider.MaterialDivider;
import com.yandex.quark.utils.extension.InsetsExtensionsKt$requestInsetsOnAttach$1;
import com.yandex.quark.webchat.filechooser.FileChooserDialog;
import defpackage.alb0;
import defpackage.bjg0;
import defpackage.cma1;
import defpackage.dzq;
import defpackage.eja1;
import defpackage.h1i0;
import defpackage.hah0;
import defpackage.leh0;
import defpackage.n751;
import defpackage.nmh0;
import defpackage.ny61;
import defpackage.t26;
import defpackage.tje;
import defpackage.tyq;
import defpackage.u1w;
import defpackage.xgb1;
import defpackage.y2j;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/quark/webchat/filechooser/FileChooserDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "applyDialogTheme", "()V", "observeTheme", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Ldzq;", "colorTheme", "Ldzq;", "Lbjg0;", "binding", "Lbjg0;", "Ltyq;", "listener", "Ltyq;", "getListener", "()Ltyq;", "setListener", "(Ltyq;)V", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FileChooserDialog extends BottomSheetDialog {
    private bjg0 binding;
    private final dzq colorTheme;
    private tyq listener;

    public FileChooserDialog(Context context) {
        super(context, h1i0.WebChat_FileChooser_Dialog_Theme);
        this.colorTheme = new dzq(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyDialogTheme() {
        bjg0 bjg0Var = this.binding;
        TextView textView = (bjg0Var == null ? null : bjg0Var).c;
        TextView textView2 = (bjg0Var == null ? null : bjg0Var).d;
        if (bjg0Var == null) {
            bjg0Var = null;
        }
        TextView[] textViewArr = {textView, textView2, bjg0Var.b};
        for (int i = 0; i < 3; i++) {
            TextView textView3 = textViewArr[i];
            long a = this.colorTheme.a(FileChooserColorKey.TextAndIconPrimary);
            textView3.setTextColor(Color.argb((int) ((a >> 24) & 255), (int) ((a >> 16) & 255), (int) ((a >> 8) & 255), (int) (255 & a)));
            textView3.setCompoundDrawableTintList(ColorStateList.valueOf(xgb1.e(a)));
        }
        bjg0 bjg0Var2 = this.binding;
        MaterialDivider[] materialDividerArr = {(MaterialDivider) (bjg0Var2 == null ? null : bjg0Var2).e.b, (MaterialDivider) (bjg0Var2 != null ? bjg0Var2 : null).f.b};
        for (int i2 = 0; i2 < 2; i2++) {
            materialDividerArr[i2].setDividerColor(xgb1.e(this.colorTheme.a(FileChooserColorKey.Separator)));
        }
        View findViewById = findViewById(leh0.design_bottom_sheet);
        if (findViewById != null) {
            findViewById.setBackgroundTintList(ColorStateList.valueOf(xgb1.e(this.colorTheme.a(FileChooserColorKey.BackgroundPrimary))));
        }
    }

    private final void observeTheme() {
        tje.N(eja1.s(this), null, null, new FileChooserDialog$observeTheme$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$3(FileChooserDialog fileChooserDialog, View view, n751 n751Var, u1w u1wVar, u1w u1wVar2) {
        int i = n751Var.a.g(519).d;
        bjg0 bjg0Var = fileChooserDialog.binding;
        if (bjg0Var == null) {
            bjg0Var = null;
        }
        LinearLayout linearLayout = bjg0Var.a;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), i);
        return zy11.a;
    }

    public final tyq getListener() {
        return null;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        View O;
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(131072);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(3);
        }
        final int i = 1;
        setCancelable(true);
        getBehavior().f0 = true;
        View inflate = LayoutInflater.from(getContext()).inflate(nmh0.quark_webchat_file_chooser_bottom_sheet, (ViewGroup) null, false);
        int i2 = hah0.capture_photo;
        TextView textView = (TextView) cma1.O(i2, inflate);
        if (textView != null) {
            i2 = hah0.choose_file;
            TextView textView2 = (TextView) cma1.O(i2, inflate);
            if (textView2 != null) {
                i2 = hah0.choose_from_gallery;
                TextView textView3 = (TextView) cma1.O(i2, inflate);
                if (textView3 != null && (O = cma1.O((i2 = hah0.divider_1), inflate)) != null) {
                    y2j y2jVar = new y2j((MaterialDivider) O, 5);
                    int i3 = hah0.divider_2;
                    View O2 = cma1.O(i3, inflate);
                    if (O2 != null) {
                        this.binding = new bjg0((LinearLayout) inflate, textView, textView2, textView3, y2jVar, new y2j((MaterialDivider) O2, 5));
                        textView.setOnClickListener(new View.OnClickListener(this) { // from class: syq
                            public final /* synthetic */ FileChooserDialog b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i4 = r2;
                                FileChooserDialog fileChooserDialog = this.b;
                                switch (i4) {
                                    case 0:
                                        fileChooserDialog.getClass();
                                        break;
                                    case 1:
                                        fileChooserDialog.getClass();
                                        break;
                                    default:
                                        fileChooserDialog.getClass();
                                        break;
                                }
                            }
                        });
                        bjg0 bjg0Var = this.binding;
                        if (bjg0Var == null) {
                            bjg0Var = null;
                        }
                        bjg0Var.c.setOnClickListener(new View.OnClickListener(this) { // from class: syq
                            public final /* synthetic */ FileChooserDialog b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i4 = i;
                                FileChooserDialog fileChooserDialog = this.b;
                                switch (i4) {
                                    case 0:
                                        fileChooserDialog.getClass();
                                        break;
                                    case 1:
                                        fileChooserDialog.getClass();
                                        break;
                                    default:
                                        fileChooserDialog.getClass();
                                        break;
                                }
                            }
                        });
                        bjg0 bjg0Var2 = this.binding;
                        if (bjg0Var2 == null) {
                            bjg0Var2 = null;
                        }
                        final int i4 = 2;
                        bjg0Var2.d.setOnClickListener(new View.OnClickListener(this) { // from class: syq
                            public final /* synthetic */ FileChooserDialog b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i42 = i4;
                                FileChooserDialog fileChooserDialog = this.b;
                                switch (i42) {
                                    case 0:
                                        fileChooserDialog.getClass();
                                        break;
                                    case 1:
                                        fileChooserDialog.getClass();
                                        break;
                                    default:
                                        fileChooserDialog.getClass();
                                        break;
                                }
                            }
                        });
                        bjg0 bjg0Var3 = this.binding;
                        if (bjg0Var3 == null) {
                            bjg0Var3 = null;
                        }
                        LinearLayout linearLayout = bjg0Var3.a;
                        alb0 alb0Var = new alb0(10, this);
                        u1w c = u1w.c(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
                        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        int i5 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
                        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                        int i6 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
                        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        int i7 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
                        ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        t26 t26Var = new t26(12, alb0Var, c, u1w.c(i5, i6, i7, marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0));
                        WeakHashMap weakHashMap = b.a;
                        ViewCompat$Api21Impl.o(linearLayout, t26Var);
                        linearLayout.addOnAttachStateChangeListener(new InsetsExtensionsKt$requestInsetsOnAttach$1());
                        if (linearLayout.isAttachedToWindow()) {
                            linearLayout.requestApplyInsets();
                        }
                        observeTheme();
                        bjg0 bjg0Var4 = this.binding;
                        setContentView((bjg0Var4 != null ? bjg0Var4 : null).a);
                        return;
                    }
                    i2 = i3;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public final void setListener(tyq tyqVar) {
    }
}
