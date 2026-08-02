package xsna;

import android.content.Context;
import android.text.Editable;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.im.ui.views.settings.LabelSettingsView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.e3m;
import xsna.y6k;

/* compiled from: CreateChatAdapter.kt */
/* loaded from: classes2.dex */
public final class t6k extends qul {
    public final y6k.b h;
    public final com.vk.im.engine.models.c i;
    public final LayoutInflater j;
    public v230 k;

    /* compiled from: CreateChatAdapter.kt */
    public static final class a implements hfz {
        public final e0o b;

        public a(e0o e0oVar) {
            this.b = e0oVar;
        }

        @Override // xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return 4;
        }
    }

    /* compiled from: CreateChatAdapter.kt */
    public static final class b extends vfz<a> {
        public final nkr0 l;

        public b(View view, y6k.b bVar) {
            super(view);
            this.l = bVar;
            jjc.g(view, new u6k(this, 0));
        }

        @Override // xsna.vfz
        public final void W5(a aVar) {
            String string;
            LabelSettingsView labelSettingsView = (LabelSettingsView) this.itemView;
            labelSettingsView.setIcon(null);
            labelSettingsView.setTitle(labelSettingsView.getResources().getString(R.string.vkim_new_chat_admission_title));
            e0o e0oVar = aVar.b;
            if (e0oVar == null) {
                string = labelSettingsView.getResources().getString(R.string.vkim_new_chat_admission_all);
            } else {
                String str = e0oVar.b;
                string = e0oVar.d ? labelSettingsView.getResources().getString(R.string.vkim_new_chat_admission_dons_type_and_higher, str) : labelSettingsView.getResources().getString(R.string.vkim_new_chat_admission_dons_type, str);
            }
            labelSettingsView.setSubtitle(string);
        }
    }

    /* compiled from: CreateChatAdapter.kt */
    public static final class c implements hfz {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        @Override // xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return 2;
        }
    }

    /* compiled from: CreateChatAdapter.kt */
    public static final class d extends vfz<c> {
        public final nkr0 l;
        public final SparseIntArray m;

        public d(View view, y6k.b bVar) {
            super(view);
            this.l = bVar;
            SparseIntArray sparseIntArray = new SparseIntArray();
            sparseIntArray.put(0, R.string.vkim_new_chat_default_type);
            sparseIntArray.put(1, R.string.vkim_new_chat_closed_type);
            sparseIntArray.put(2, R.string.vkim_new_chat_custom_type);
            this.m = sparseIntArray;
            jjc.g(view, new fm0(this, 25));
        }

        @Override // xsna.vfz
        public final void W5(c cVar) {
            ((LabelSettingsView) this.itemView).setSubtitle(b6().getString(this.m.get(cVar.b)));
        }
    }

    /* compiled from: CreateChatAdapter.kt */
    public static final class e implements hfz {
        public static final e b = new e();

        @Override // xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return 3;
        }
    }

    /* compiled from: CreateChatAdapter.kt */
    public static final class f extends vfz<e> {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(e eVar) {
        }
    }

    /* compiled from: CreateChatAdapter.kt */
    public static final class g implements hfz {
        public final v230 b;

        public g(v230 v230Var) {
            this.b = v230Var;
        }

        @Override // xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return 0;
        }
    }

    /* compiled from: CreateChatAdapter.kt */
    public static final class h extends vfz<g> {
        public final nkr0 l;
        public boolean m;
        public final AppCompatEditText n;
        public final AvatarView o;
        public w6k p;

        /* compiled from: CreateChatAdapter.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AvatarAction.values().length];
                try {
                    iArr[AvatarAction.CHANGE_BY_CAMERA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AvatarAction.CHANGE_BY_GALLERY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AvatarAction.CHANGE_BY_MINI_APP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AvatarAction.REMOVE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public h(View view, y6k.b bVar) {
            super(view);
            this.l = bVar;
            this.m = true;
            AppCompatEditText appCompatEditText = (AppCompatEditText) view.findViewById(R.id.vkim_title);
            this.n = appCompatEditText;
            AvatarView avatarView = (AvatarView) view.findViewById(R.id.vkim_avatar);
            this.o = avatarView;
            Context context = appCompatEditText.getContext();
            int f = e3m.f(R.attr.vk_ui_field_background, context);
            int f2 = e3m.f(R.attr.vk_ui_field_background, context);
            int f3 = e3m.f(R.attr.vk_ui_stroke_accent, context);
            int f4 = e3m.f(R.attr.vk_ui_field_border_alpha, context);
            int i = wvv0.a;
            appCompatEditText.setBackground(wvv0.a(context, R.drawable.vkui_bg_edittext, f, f2, f3, f4));
            avatarView.T0(null, m33.a(R.drawable.ic_camera_outline_placeholder, context));
        }

        @Override // xsna.vfz
        public final void W5(g gVar) {
            Editable text;
            v230 v230Var = gVar.b;
            boolean z = this.m;
            AppCompatEditText appCompatEditText = this.n;
            if (z) {
                this.m = false;
                mhy.j(appCompatEditText);
            }
            int length = v230Var.j.length();
            AvatarView avatarView = this.o;
            if (length == 0) {
                Context context = this.itemView.getContext();
                e3m.a aVar = e3m.a;
                avatarView.T0(null, m33.a(R.drawable.ic_camera_outline_placeholder, context));
            } else {
                Serializer.c<ImageList> cVar = ImageList.CREATOR;
                ImageList c = ImageList.a.c(-1, -1, v230Var.j);
                AvatarView.a aVar2 = AvatarView.y;
                avatarView.T0(c, null);
            }
            jjc.g(avatarView, new v6k(this, v230Var.c, r1));
            Editable text2 = appCompatEditText.getText();
            boolean z2 = text2 == null || text2.length() == 0;
            appCompatEditText.setText(v230Var.i);
            if (z2 && (text = appCompatEditText.getText()) != null && text.length() > 0) {
                Editable text3 = appCompatEditText.getText();
                appCompatEditText.setSelection(text3 != null ? text3.length() : 0);
            }
            appCompatEditText.removeTextChangedListener(this.p);
            w6k w6kVar = new w6k(v230Var, this);
            this.p = w6kVar;
            appCompatEditText.addTextChangedListener(w6kVar);
        }
    }

    /* compiled from: CreateChatAdapter.kt */
    public static final class i implements hfz {
        public final qtd0 b;

        public i(qtd0 qtd0Var) {
            this.b = qtd0Var;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Long.valueOf(this.b.id());
        }
    }

    /* compiled from: CreateChatAdapter.kt */
    public static final class j extends vfz<i> {
        public final nkr0 l;
        public final AvatarView m;
        public final ImageView n;
        public final TextView o;
        public final View p;
        public final View q;

        public j(View view, y6k.b bVar) {
            super(view);
            this.l = bVar;
            this.m = (AvatarView) view.findViewById(R.id.vkim_avatar);
            this.n = (ImageView) view.findViewById(R.id.online);
            this.o = (TextView) view.findViewById(R.id.vkim_username);
            this.p = view.findViewById(R.id.vkim_remove);
            this.q = view.findViewById(R.id.vkim_user_info);
        }

        @Override // xsna.vfz
        public final void W5(i iVar) {
            qtd0 qtd0Var = iVar.b;
            this.o.setText(qtd0Var.Q2(UserNameCase.NOM));
            fp80.a(this.n, qtd0Var);
            this.m.Y0(qtd0Var);
            boolean z = qtd0Var instanceof com.vk.im.engine.models.contacts.a;
            View view = this.q;
            if (z) {
                view.setVisibility(o25.b(o25.a()) ? 0 : 8);
                this.itemView.setEnabled(false);
                this.itemView.setOnClickListener(null);
            } else {
                view.setVisibility(8);
                this.itemView.setEnabled(true);
                this.itemView.setOnClickListener(new mmb(1, this, qtd0Var));
            }
            this.p.setOnClickListener(new te5(3, this, qtd0Var));
        }
    }

    public t6k(Context context, com.vk.im.engine.models.c cVar, y6k.b bVar) {
        super(false);
        this.h = bVar;
        this.i = cVar;
        LayoutInflater from = LayoutInflater.from(context);
        this.j = from;
        this.k = new v230(null, null, false, false, null, 2047);
        setHasStableIds(true);
        from.getContext();
        this.e.put(0, new fqj0(g.class, new t9e(this, 12)));
        this.e.put(1, new fqj0(i.class, new dkg(this, 9)));
        this.e.put(2, new fqj0(c.class, new nfj(this, 1)));
        this.e.put(4, new fqj0(a.class, new qpj(this, 3)));
        this.e.put(3, new fqj0(e.class, new s6k(this, 0)));
    }

    public final void J0(v230 v230Var) {
        Integer num;
        this.k = v230Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g(v230Var));
        if (this.k.g.isEmpty()) {
            v230 v230Var2 = this.k;
            if (!v230Var2.c && (num = v230Var2.k) != null) {
                arrayList.add(new c(num.intValue()));
            }
        } else {
            arrayList.add(new a(this.k.h));
        }
        if (v230Var.f.isEmpty()) {
            arrayList.add(e.b);
        } else {
            Iterator<T> it = v230Var.f.iterator();
            while (it.hasNext()) {
                arrayList.add(new i((qtd0) it.next()));
            }
        }
        setItems(arrayList);
    }
}
